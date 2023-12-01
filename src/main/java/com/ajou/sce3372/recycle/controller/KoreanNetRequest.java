package com.ajou.sce3372.recycle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajou.sce3372.recycle.dto.KnItemInfoDTO;
import com.ajou.sce3372.recycle.service.KoreanNetFetch;

@RestController
@RequestMapping("/api")
public class KoreanNetRequest {
    
    @Autowired KoreanNetFetch koreanNetFetch;

    @GetMapping(value = "/kn/{barcode}")
    public KnItemInfoDTO getKoreanNetPage(@PathVariable String barcode) {
        return koreanNetFetch.fetchKoreanNet(barcode);
    }
}
