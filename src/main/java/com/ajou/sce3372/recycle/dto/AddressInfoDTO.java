package com.ajou.sce3372.recycle.dto;

public class AddressInfoDTO {
    private String latitude = null;
    private String longtitude = null;
    private String address_level_0 = null;
    private String address_level_1 = null;
    private String address_level_2 = null;
    private String address_level_3 = null;
    private String land_building = null;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    
}
