package com.ajou.sce3372.recycle.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajou.sce3372.recycle.dto.GuideInfoDTO;
import com.ajou.sce3372.recycle.dto.ItemInfoDTO;
import com.ajou.sce3372.recycle.dto.RecycleInfoDTO;
import com.ajou.sce3372.recycle.service.GuideInfoSearch;
import com.ajou.sce3372.recycle.service.ItemInfoSearch;

@RestController
@RequestMapping("/api")
public class RecycleInfoRequest {

    @Autowired
    private ItemInfoSearch itemInfoSearch;
    @Autowired
    private GuideInfoSearch guideInfoSearch;

    @GetMapping(value = "/recycle/{barcode}")
    public RecycleInfoDTO searchRecycleInfo(@PathVariable String barcode, @RequestParam String location) throws ExecutionException, InterruptedException{
        
        System.out.println("Request Incomming: Recycle - " + barcode + "/" + location);

        ItemInfoDTO itemInfoDTO = itemInfoSearch.searchItemInfo(barcode);
        GuideInfoDTO guideInfoDTO = guideInfoSearch.searchGuideInfo(location);
        RecycleInfoDTO recycleInfoDTO = new RecycleInfoDTO(itemInfoDTO, guideInfoDTO);
        return recycleInfoDTO;
    }

    @GetMapping(value = "/items/{barcode}")
    public ItemInfoDTO searchItemInfo(@PathVariable String barcode) throws ExecutionException, InterruptedException{
        
        System.out.println("Request Incomming: Item - " + barcode);

        ItemInfoDTO itemInfoDTO = itemInfoSearch.searchItemInfo(barcode);
        return itemInfoDTO;
    }

    @GetMapping(value = "/guides")
    public GuideInfoDTO searchGuideInfo(@RequestParam String location) throws ExecutionException, InterruptedException{
        
        System.out.println("Request Incomming: Guide - " + location);

        GuideInfoDTO guideInfoDTO = guideInfoSearch.searchGuideInfo(location);
        return guideInfoDTO;
    }
}