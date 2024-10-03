package com.jd.infectious.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (NewCaseData)实体类
 *
 * @author makejava
 * @since 2024-09-03 19:29:09
 */
@Data
public class NewCaseData implements Serializable {
    private static final long serialVersionUID = -73371868239354209L;
    
    private Integer idx;
    
    private Integer agentNum;
    
    private Integer agentId;
    
    private Integer isNewCase;
    
    private Integer parentCase;
    
    private Integer step;
    
    private Integer region;


    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getAgentNum() {
        return agentNum;
    }

    public void setAgentNum(Integer agentNum) {
        this.agentNum = agentNum;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getIsNewCase() {
        return isNewCase;
    }

    public void setIsNewCase(Integer isNewCase) {
        this.isNewCase = isNewCase;
    }

    public Integer getParentCase() {
        return parentCase;
    }

    public void setParentCase(Integer parentCase) {
        this.parentCase = parentCase;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

}

