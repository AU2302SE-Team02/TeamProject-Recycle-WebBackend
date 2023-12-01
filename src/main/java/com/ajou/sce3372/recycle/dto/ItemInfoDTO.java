package com.ajou.sce3372.recycle.dto;

import java.util.Map;

import com.ajou.sce3372.recycle.entity.ItemInfo;

public class ItemInfoDTO {
    
    private String itemDocuID;
    private String itemID;
    private String itemImageLink;
    private String itemName;
    private Map<String, String> itemParts;
    private String itemDateCreated;
    private String itemDateModified;

    public ItemInfoDTO(ItemInfo itemInfo) {
        this.itemDocuID = itemInfo.getItemDocuId();
        this.itemID = itemInfo.getItemId();
        this.itemImageLink = itemInfo.getItemImageLink();
        this.itemName = itemInfo.getItemName();
        this.itemParts = itemInfo.getItemParts();
        this.itemDateCreated = itemInfo.getItemDateCreated();
        this.itemDateModified = itemInfo.getItemDateModified();
    }

    // 이하 Getter Methods
    public String getItemDocuId() {
        return itemDocuID;
    }

    public String getItemId() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemImageLink() {
        return itemImageLink;
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

    // 이하 Setter Methods
    public void setItemDocuID(String itemDocuID) {
        this.itemDocuID = itemDocuID;
    }

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
}
