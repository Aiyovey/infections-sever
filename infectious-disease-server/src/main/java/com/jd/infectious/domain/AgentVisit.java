package com.jd.infectious.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (AgentVisit)实体类
 *
 * @author makejava
 * @since 2024-09-03 19:29:09
 */
@Data
public class AgentVisit implements Serializable {
    private static final long serialVersionUID = -55279531628978788L;
    
    private Integer idx;
    
    private Integer id;
    
    private Integer agentType;
    
    private Integer gender;
    
    private Integer age;
    
    private Double resistance;
    
    private Integer isRegularCustomer;
    
    private Integer initialState;
    
    private Integer boothsId;
    
    private String boothsPolygon;
    
    private Double centerLongitude;
    
    private Double centerLatitude;
    
    private Integer visitDay;
    
    private Integer visitHour;
    
    private Integer visitTimeSlice;
    
    private Integer movePattern;
    
    private Integer marketEntrance;
    
    private Integer marketExport;
    
    private Integer marketStartTime;
    
    private Integer marketEndTime;
    
    private Integer region;
    
    private Integer entranceId;
    
    private Integer exitId;
    
    private Integer startTime;
    
    private Integer endTime;
    
    private Integer startState;
    
    private Integer endState;


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

    public Integer getAgentType() {
        return agentType;
    }

    public void setAgentType(Integer agentType) {
        this.agentType = agentType;
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

    public Integer getVisitDay() {
        return visitDay;
    }

    public void setVisitDay(Integer visitDay) {
        this.visitDay = visitDay;
    }

    public Integer getVisitHour() {
        return visitHour;
    }

    public void setVisitHour(Integer visitHour) {
        this.visitHour = visitHour;
    }

    public Integer getVisitTimeSlice() {
        return visitTimeSlice;
    }

    public void setVisitTimeSlice(Integer visitTimeSlice) {
        this.visitTimeSlice = visitTimeSlice;
    }

    public Integer getMovePattern() {
        return movePattern;
    }

    public void setMovePattern(Integer movePattern) {
        this.movePattern = movePattern;
    }

    public Integer getMarketEntrance() {
        return marketEntrance;
    }

    public void setMarketEntrance(Integer marketEntrance) {
        this.marketEntrance = marketEntrance;
    }

    public Integer getMarketExport() {
        return marketExport;
    }

    public void setMarketExport(Integer marketExport) {
        this.marketExport = marketExport;
    }

    public Integer getMarketStartTime() {
        return marketStartTime;
    }

    public void setMarketStartTime(Integer marketStartTime) {
        this.marketStartTime = marketStartTime;
    }

    public Integer getMarketEndTime() {
        return marketEndTime;
    }

    public void setMarketEndTime(Integer marketEndTime) {
        this.marketEndTime = marketEndTime;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public Integer getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Integer entranceId) {
        this.entranceId = entranceId;
    }

    public Integer getExitId() {
        return exitId;
    }

    public void setExitId(Integer exitId) {
        this.exitId = exitId;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getStartState() {
        return startState;
    }

    public void setStartState(Integer startState) {
        this.startState = startState;
    }

    public Integer getEndState() {
        return endState;
    }

    public void setEndState(Integer endState) {
        this.endState = endState;
    }

}

