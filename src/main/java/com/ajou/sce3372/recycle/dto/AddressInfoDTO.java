package com.ajou.sce3372.recycle.dto;

public class AddressInfoDTO {
    private String latitude;        // 위도
    private String longitude;      // 경도
    private String address_level_0; // 국가급 주소
    private String address_level_1; // 시도급 주소
    private String address_level_2; // 시군구급 주소
    private String address_level_3; // 읍면동급 주소
    private String land_building;   // 건물명

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getAddressLvl0() {
        return address_level_0;
    }

    public String getAddressLvl1() {
        return address_level_1;
    }

    public String getAddressLvl2() {
        return address_level_2;
    }

    public String getAddressLvl3() {
        return address_level_3;
    }

    public String getAddressLand() {
        return land_building;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setAddress_level_0(String address_level_0) {
        this.address_level_0 = address_level_0;
    }

    public void setAddress_level_1(String address_level_1) {
        this.address_level_1 = address_level_1;
    }

    public void setAddress_level_2(String address_level_2) {
        this.address_level_2 = address_level_2;
    }

    public void setAddress_level_3(String address_level_3) {
        this.address_level_3 = address_level_3;
    }

    public void setLand_building(String land_building) {
        this.land_building = land_building;
    }
}
