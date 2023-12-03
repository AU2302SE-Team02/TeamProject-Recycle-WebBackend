package com.ajou.sce3372.recycle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajou.sce3372.recycle.dto.AddressInfoDTO;
import com.ajou.sce3372.recycle.service.CoordRGC;

@RestController
@RequestMapping("/api")
public class CoordRGCRequest {
    
    @Autowired
    private CoordRGC coordRGC;

    @GetMapping(value = "/rgc")
    public AddressInfoDTO getAddress(@RequestParam String latitude, @RequestParam String longitude) {
        return coordRGC.requestRGCtoNmapAPI(latitude, longitude);
    }
}
