package com.ajou.sce3372.recycle.entity;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;

import java.util.Map;

@Document(collectionName = "items")
public class ItemInfo {
    
    @DocumentId private String itemDocuID;
    private String itemID;
    private String itemImageLink;
    private String itemName;
    private Map<String, String> itemParts;
    private Timestamp itemDateCreated;
    private Timestamp itemDateModified;

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
        return itemDateCreated.toString();
    }

    public String getItemDateModified() {
        return itemDateModified.toString();
    }
}
