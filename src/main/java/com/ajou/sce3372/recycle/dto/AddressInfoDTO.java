package com.ajou.sce3372.recycle.dto;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressInfoDTO {
    private String latitude;        // 위도
    private String longitude;       // 경도
    private String address_level_0; // 국가급 주소
    private String address_level_1; // 시도급 주소
    private String address_level_2; // 시군구급 주소
    private String address_level_3; // 읍면동급 주소
    private String land_building;   // 건물명

    public AddressInfoDTO(String json, String latitude, String longitude) {

        this.latitude = latitude;
        this.longitude = longitude;
        
        JSONParser parser = new JSONParser();
        try {
            JSONObject object = (JSONObject) parser.parse(json);
            JSONArray results = (JSONArray) object.get("results");
            JSONObject admcode = (JSONObject) results.get(0);
            JSONObject roadaddr = (JSONObject) results.get(1);
            JSONObject region_adm = (JSONObject) admcode.get("region");
            JSONObject land = (JSONObject) roadaddr.get("land");

            JSONObject area0_adm = (JSONObject) region_adm.get("area0");
            JSONObject area1_adm = (JSONObject) region_adm.get("area1");
            JSONObject area2_adm = (JSONObject) region_adm.get("area2");
            JSONObject area3_adm = (JSONObject) region_adm.get("area3");
            JSONObject addition0 = (JSONObject) land.get("addition0");
                    
            this.address_level_0 = (String) area0_adm.get("name");
            this.address_level_1 = (String) area1_adm.get("name");
            this.address_level_2 = (String) area2_adm.get("name");
            this.address_level_3 = (String) area3_adm.get("name");
            if (((String) addition0.get("value")).equals("")) {
                this.land_building = null;
            } else {
                this.land_building = (String) addition0.get("value");
            }
        } catch (ParseException e) { }
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getAddressLvl0() {
        return address_level_0;
    }

    public String getAddressLvl1() {
        return address_level_1;
    }

    public String getAddressLvl2() {
        return address_level_2;
    }

    public String getAddressLvl3() {
        return address_level_3;
    }

    public String getAddressLand() {
        return land_building;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setAddress_level_0(String address_level_0) {
        this.address_level_0 = address_level_0;
    }

    public void setAddress_level_1(String address_level_1) {
        this.address_level_1 = address_level_1;
    }

    public void setAddress_level_2(String address_level_2) {
        this.address_level_2 = address_level_2;
    }

    public void setAddress_level_3(String address_level_3) {
        this.address_level_3 = address_level_3;
    }

    public void setLand_building(String land_building) {
        this.land_building = land_building;
    }
}
