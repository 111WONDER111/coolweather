package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id; // 实体类唯一字段

    private String cityName; // 城市名字

    private int cityCode; // 城市代号

    private int provinceId; // 城市所在省的Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceCode(int provinceId) {
        this.provinceId = provinceId;
    }
}
