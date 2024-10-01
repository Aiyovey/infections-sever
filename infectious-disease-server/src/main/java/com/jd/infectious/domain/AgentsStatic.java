package com.jd.infectious.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (AgentsStatic)实体类
 *
 * @author makejava
 * @since 2024-09-03 19:29:09
 */
@Data
public class AgentsStatic implements Serializable {
    private static final long serialVersionUID = -15240053252953559L;
    
    private Integer idx;
    
    private Integer id;
    
    private Integer type;
    
    private Integer gender;
    
    private Integer age;
    
    private Double resistance;
    
    private Integer isRegularCustomer;
    
    private Integer initialState;
    
    private Integer boothsId;
    
    private String boothsPolygon;
    
    private Double centerLongitude;
    
    private Double centerLatitude;


    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getResistance() {
        return resistance;
    }

    public void setResistance(Double resistance) {
        this.resistance = resistance;
    }

    public Integer getIsRegularCustomer() {
        return isRegularCustomer;
    }

    public void setIsRegularCustomer(Integer isRegularCustomer) {
        this.isRegularCustomer = isRegularCustomer;
    }

    public Integer getInitialState() {
        return initialState;
    }

    public void setInitialState(Integer initialState) {
        this.initialState = initialState;
    }

    public Integer getBoothsId() {
        return boothsId;
    }

    public void setBoothsId(Integer boothsId) {
        this.boothsId = boothsId;
    }

    public String getBoothsPolygon() {
        return boothsPolygon;
    }

    public void setBoothsPolygon(String boothsPolygon) {
        this.boothsPolygon = boothsPolygon;
    }

    public Double getCenterLongitude() {
        return centerLongitude;
    }

    public void setCenterLongitude(Double centerLongitude) {
        this.centerLongitude = centerLongitude;
    }

    public Double getCenterLatitude() {
        return centerLatitude;
    }

    public void setCenterLatitude(Double centerLatitude) {
        this.centerLatitude = centerLatitude;
    }

}

