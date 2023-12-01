package com.ajou.sce3372.recycle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajou.sce3372.recycle.dto.ItemInfoDTO;
import com.ajou.sce3372.recycle.entity.ItemInfo;
import com.ajou.sce3372.recycle.repository.ItemRepo;

@Service
public class ItemInfoSearch {
    
    @Autowired
    private ItemRepo itemRepo;

    public ItemInfoDTO searchItemInfo(String barcode) {
        try {
            ItemInfo itemInfo = itemRepo.getItemInfo(barcode);
            ItemInfoDTO itemInfoDTO = new ItemInfoDTO(itemInfo);
            return itemInfoDTO;
        } catch (Exception e) {
            System.out.println("Error in Service : GuideInfoSearch");
            e.printStackTrace();
            return null;
        }
    }
}
