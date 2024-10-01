package com.jd.infectious.common.vo;

import lombok.Data;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;

import java.util.List;

@Data
public class NewCaseDataVO {

    /**
     * 传染病 传染数据  [{key:step value:传染人数}]
     */
    List<DefaultKeyValue<Integer, Integer>> caseData;

    /**
     * 横坐标标签
     */
    List<DefaultKeyValue<Integer, String>> xlabel;

}