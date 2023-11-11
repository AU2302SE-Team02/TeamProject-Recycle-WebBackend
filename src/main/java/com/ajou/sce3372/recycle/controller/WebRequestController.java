package com.ajou.sce3372.recycle.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajou.sce3372.recycle.entity.ItemInfo;
import com.ajou.sce3372.recycle.service.RecycleService;

@RestController
@RequestMapping("/api")
public class WebRequestController {

    @Autowired
    private RecycleService recycleService;

    @GetMapping(value = "/items/{barcode}")
    public ItemInfo itemSearchByPath(@PathVariable String barcode) throws ExecutionException, InterruptedException{
        return recycleService.searchItem(barcode);
    }
    
}