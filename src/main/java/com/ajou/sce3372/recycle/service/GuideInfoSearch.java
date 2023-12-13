package com.ajou.sce3372.recycle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajou.sce3372.recycle.dto.GuideInfoDTO;
import com.ajou.sce3372.recycle.entity.GuideInfo;
import com.ajou.sce3372.recycle.repository.GuideRepo;

@Service
public class GuideInfoSearch {
    
    @Autowired
    private GuideRepo guideRepo;

    public GuideInfoDTO searchGuideInfo(String location) {

        try {
            GuideInfo guideInfo = guideRepo.getGuideInfo(location);
            GuideInfoDTO guideInfoDTO = new GuideInfoDTO(guideInfo);
            return guideInfoDTO;
        } catch (NullPointerException npe) {
            System.out.println("GuideInfoSearch : Document not exists - " + location);
            return null;
        } catch (Exception e) {
            System.out.println("Exception in Service : GuideInfoSearch");
            e.printStackTrace();
            return null;
        }
    }
}
