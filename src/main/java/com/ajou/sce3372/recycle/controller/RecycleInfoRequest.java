package com.ajou.sce3372.recycle.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajou.sce3372.recycle.entity.ItemInfo;
import com.ajou.sce3372.recycle.service.ItemInfoSearch;

@RestController
@RequestMapping("/api")
public class RecycleInfoRequest {

    @Autowired
    private ItemInfoSearch itemInfoSearch;

    @GetMapping(value = "/items/{barcode}")
    public ItemInfo searchRecycleInfo(@PathVariable String barcode) throws ExecutionException, InterruptedException{
        return itemInfoSearch.searchItemInfo(barcode);
    }
}