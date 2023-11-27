package com.ajou.sce3372.recycle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajou.sce3372.recycle.entity.ItemInfo;
import com.ajou.sce3372.recycle.repository.ItemRepo;

@Service
public class ItemInfoSearch {
    
    @Autowired
    private ItemRepo itemRepo;

    public ItemInfo searchItemInfo(String barcode) {
        try {
            ItemInfo itemInfoDTO = itemRepo.getItemInfo(barcode);
            return itemInfoDTO;
        } catch (Exception e) {
            return null;
        }
    }
}
