package com.ajou.sce3372.recycle.dto;

import java.util.Map;

import com.ajou.sce3372.recycle.entity.GuideInfo;

public class GuideInfoDTO {
    
    private String guideLocationNameDocuID;
    private String guideDateCreated;
    private String guideDateModified;
    private String guideDateUpdated;
    private String guideHigherAuthority;
    private String guideLocationName;
    private Map<String, String> guideMaterials;

    public GuideInfoDTO(GuideInfo guideInfo) {
        this.guideLocationNameDocuID = guideInfo.getGuideLocationNameDocuID();
        this.guideDateCreated = guideInfo.getGuideDateCreated();
        this.guideDateModified = guideInfo.getGuideDateModified();
        this.guideDateUpdated = guideInfo.getGuideDateUpdated();
        this.guideHigherAuthority = guideInfo.getGuideHigherAuthority();
        this.guideLocationName = guideInfo.getGuideLocationName();
        this.guideMaterials = guideInfo.getGuideMaterials();
    }

    // 이하 Getter Methods
    public String getGuideLocationNameDocuID() {
        return guideLocationNameDocuID;
    }

    public String getGuideDateCreated() {
        return guideDateCreated;
    }

    public String getGuideDateModified() {
        return guideDateModified;
    }

    public String getGuideDateUpdated() { 
        return guideDateUpdated; 
    }

    public String getGuideHigherAuthority() {
        return guideHigherAuthority;
    }

    public String getGuideLocationName() {
        return guideLocationName;
    }

    public Map<String, String> getGuideMaterials() {
        return guideMaterials;
    }

    // 이하 Setter Methods
    public void setGuideLocationNameDocuID(String guideLocationNameDocuID) {
        this.guideLocationNameDocuID = guideLocationNameDocuID;
    }

    public void setGuideDateCreated(String guideDateCreated) {
        this.guideDateCreated = guideDateCreated;
    }

    public void setGuideDateModified(String guideDateModified) {
        this.guideDateModified = guideDateModified;
    }

    public void setGuideDateUpdated(String guideDateUpdated) {
        this.guideDateUpdated = guideDateUpdated;
    }

    public void setGuideHigherAuthority(String guideHigherAuthority) {
        this.guideHigherAuthority = guideHigherAuthority;
    }

    public void setGuideLocationName(String guideLocationName) {
        this.guideLocationName = guideLocationName;
    }

    public void setGuideMaterials(Map<String, String> guideMaterials) {
        this.guideMaterials = guideMaterials;
    }
}
