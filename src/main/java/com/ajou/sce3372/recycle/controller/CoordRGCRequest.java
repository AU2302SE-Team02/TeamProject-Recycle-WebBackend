package com.ajou.sce3372.recycle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajou.sce3372.recycle.service.CoordRGC;

@RestController
@RequestMapping("/api")
public class CoordRGCRequest {
    
    @Autowired
    private CoordRGC coordRGC;

    @GetMapping(value = "/rgc")
    public String getAddress(@RequestParam String latitude, @RequestParam String longtitude) {
        return coordRGC.requestRGCtoNmapAPI(latitude, longtitude);
    }
}
