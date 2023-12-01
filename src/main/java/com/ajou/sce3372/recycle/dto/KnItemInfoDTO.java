package com.ajou.sce3372.recycle.dto;

public class KnItemInfoDTO {
    private String knItemBarcode;
    private String knItemName;
    private String knItemImageSrc;

    public KnItemInfoDTO() {
        this.knItemBarcode = null;
        this.knItemName = null;
        this.knItemImageSrc = null;
    }

    public String getKnItemBarcode() {
        return knItemBarcode;
    }

    public String getKnItemName() {
        return knItemName;
    }

    public String getKnItemImageSrc() {
        return knItemImageSrc;
    }

    public void setKnItemBarcode(String newKnItemBarcode) {
        this.knItemBarcode = newKnItemBarcode;
    }
    
    public void setKnItemName(String newKnItemName) {
        this.knItemName = newKnItemName;
    }

    public void setKnItemImageSrc(String newKnItemImageSrc) {
        this.knItemImageSrc = newKnItemImageSrc;
    }
}
