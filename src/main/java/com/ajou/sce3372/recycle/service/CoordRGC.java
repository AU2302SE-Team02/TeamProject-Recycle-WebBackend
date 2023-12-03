package com.ajou.sce3372.recycle.service;

import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ajou.sce3372.recycle.dto.AddressInfoDTO;

@Service
public class CoordRGC {
    public AddressInfoDTO requestRGCtoNmapAPI(String latitude, String longitude) {

        String clientID = null;
        String clientSecret = null;

        try {
            JSONObject clientKey = readJsonKey();
            clientID = clientKey.get("client_id").toString();
            clientSecret = clientKey.get("client_secret").toString();
        } catch (Exception e) {
            return null;
        }

        WebClient webClient = WebClient.builder().build();
        String endpointUrl = "https://naveropenapi.apigw.ntruss.com/map-reversegeocode/v2/gc";
        String options = "&orders=admcode,roadaddr&output=json";
        String requestUrl = endpointUrl + "?coords=" + longitude + "," + latitude + options;

        String response = webClient.get()
            .uri(requestUrl)
            .header("X-NCP-APIGW-API-KEY-ID", clientID)
            .header("X-NCP-APIGW-API-KEY", clientSecret)
            .retrieve()
            .bodyToMono(String.class)
            .block();

        AddressInfoDTO addressInfoDTO = new AddressInfoDTO(response, latitude, longitude);

        return addressInfoDTO;
    }

    private JSONObject readJsonKey() throws Exception {
        JSONParser parser = new JSONParser();

        Reader reader = new FileReader("./src/main/resources/naverMapClientKey.json");
        JSONObject clientKey = (JSONObject) parser.parse(reader);

        return clientKey;
    }
}