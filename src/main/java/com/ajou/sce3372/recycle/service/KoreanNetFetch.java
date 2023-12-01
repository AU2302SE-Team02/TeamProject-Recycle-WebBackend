package com.ajou.sce3372.recycle.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.ajou.sce3372.recycle.dto.KnItemInfoDTO;

@Service
public class KoreanNetFetch {
    
    public KnItemInfoDTO fetchKoreanNet(String barcode) {

        KnItemInfoDTO knItemInfoDTO = new KnItemInfoDTO();
        String itemName = "";
        String itemImgSrc = "";

        try {
            // 웹 페이지 가져오기
            Document doc = Jsoup.connect("http://www.koreannet.or.kr/home/hpisSrchGtin.gs1?gtin=" + barcode).get();

            // 아이템 이름 받아오기
            // 원하는 요소 선택하기
            Elements itemNameElements = doc.select(".productTit");

            // 선택한 요소 출력
            String text = itemNameElements.get(0).text();
            String[] words = text.split("\\s+"); // 빈 칸을 기준으로 분할
            for (int j = 2; j < words.length; j++) {
                itemName += (words[j] + " ");
            }
            System.out.println("Product Title: " + itemName);
            //itemName에 바코드 크롤링했을 때 아이템 이름이 검색됨.

            // 아이템 사진 링크 받아오기
            // 원하는 요소 선택하기
            Elements itemImgElements = doc.select("#detailImage");

            // 선택한 요소 출력
            itemImgSrc = itemImgElements.get(0).attr("src");
            System.out.println("Product Img src: " + itemImgSrc);
            //itemImgSrc에 바코드 크롤링했을 때 아이템 이미지 주소가 저장됨

            knItemInfoDTO.setKnItemBarcode(barcode);
            knItemInfoDTO.setKnItemName(itemName);
            knItemInfoDTO.setKnItemImageSrc(itemImgSrc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return knItemInfoDTO;
    }
}
