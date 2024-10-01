package com.jd.infectious.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (AgentsDynamic)实体类
 *
 * @author makejava
 * @since 2024-09-03 19:29:09
 */

@Data
public class AgentsDynamic implements Serializable {
    private static final long serialVersionUID = 807259682411211094L;
    
    private Integer idx;
    
    private Integer step;
    
    private Integer agent;
    
    private Double longitude;
    
    private Double latitude;
    
    private Integer state;
    
    private Integer virusLoadQuantity;


    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getAgent() {
        return agent;
    }

    public void setAgent(Integer agent) {
        this.agent = agent;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getVirusLoadQuantity() {
        return virusLoadQuantity;
    }

    public void setVirusLoadQuantity(Integer virusLoadQuantity) {
        this.virusLoadQuantity = virusLoadQuantity;
    }

}

