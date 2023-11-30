package com.ajou.sce3372.recycle.dto;

public class KnItemInfoDTO {
    private String knItemName;
    private String knItemImageSrc;

    public KnItemInfoDTO() {
        this.knItemName = null;
        this.knItemImageSrc = null;
    }

    public String getKnItemName() {
        return knItemName;
    }

    public String getKnItemImageSrc() {
        return knItemImageSrc;
    }

    public void setKnItemName(String newKnItemName) {
        this.knItemName = newKnItemName;
    }

    public void setKnItemImageSrc(String newKnItemImageSrc) {
        this.knItemImageSrc = newKnItemImageSrc;
    }
}
