package com.jd.infectious.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("new_case_data")
public class NewCaseDataEntity {
    private static final long serialVersionUID = 1L;

    @TableId
    private Long idx;

    private Integer agentNum;
    private Integer agentId;
    private Integer isNewCase;
    private Integer parentCase;
    private Integer step;
    private Integer region;
    private Integer day;
}
