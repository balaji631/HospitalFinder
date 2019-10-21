package com.iteyes.placesproject;

import com.google.android.gms.maps.model.LatLng;

class Hospital {
    private String name;
    private String address;
    private String phone;
    private LatLng latLng;

    public Hospital(String name, String address, String phone, LatLng latLng) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.latLng = latLng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }
}
