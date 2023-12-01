package com.ajou.sce3372.recycle.dto;

import java.util.Map;

public class RecycleInfoDTO {
    
    private String itemID;
    private String itemImageLink;
    private String itemName;
    private Map<String, String> itemParts;
    private String itemDateCreated;
    private String itemDateModified;

    private String guideDateCreated;
    private String guideDateModified;
    private String guideDateUpdated;
    private String guideHigherAuthority;
    private String guideLocationName;
    private Map<String, String> guideMaterials;

    public RecycleInfoDTO(ItemInfoDTO itemInfoDTO, GuideInfoDTO guideInfoDTO) {
        // ItemInfoDTO로부터 정보 설정
        this.itemID = itemInfoDTO.getItemId();
        this.itemImageLink = itemInfoDTO.getItemImageLink();
        this.itemName = itemInfoDTO.getItemName();
        this.itemParts = itemInfoDTO.getItemParts();
        this.itemDateCreated = itemInfoDTO.getItemDateCreated();
        this.itemDateModified = itemInfoDTO.getItemDateModified();

        // GuideInfoDTO로부터 정보 설정
        this.guideDateCreated = guideInfoDTO.getGuideDateCreated();
        this.guideDateModified = guideInfoDTO.getGuideDateModified();
        this.guideDateUpdated = guideInfoDTO.getGuideDateUpdated();
        this.guideHigherAuthority = guideInfoDTO.getGuideHigherAuthority();
        this.guideLocationName = guideInfoDTO.getGuideLocationName();
        this.guideMaterials = guideInfoDTO.getGuideMaterials();
    }

    // Getter 메서드들
    public String getItemID() {
        return itemID;
    }

    public String getItemImageLink() {
        return itemImageLink;
    }

    public String getItemName() {
        return itemName;
    }

    public Map<String, String> getItemParts() {
        return itemParts;
    }

    public String getItemDateCreated() {
        return itemDateCreated;
    }

    public String getItemDateModified() {
        return itemDateModified;
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

    // Setter 메서드들
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setItemImageLink(String itemImageLink) {
        this.itemImageLink = itemImageLink;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemParts(Map<String, String> itemParts) {
        this.itemParts = itemParts;
    }

    public void setItemDateCreated(String itemDateCreated) {
        this.itemDateCreated = itemDateCreated;
    }

    public void setItemDateModified(String itemDateModified) {
        this.itemDateModified = itemDateModified;
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
