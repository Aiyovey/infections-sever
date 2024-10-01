package com.jd.infectious.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (Parameters)实体类
 *
 * @author makejava
 * @since 2024-09-03 19:29:09
 */
@Data
public class Parameters implements Serializable {
    private static final long serialVersionUID = 404990625291579748L;
    
    private Integer idx;
    
    private String name;
    
    private String value;


    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

