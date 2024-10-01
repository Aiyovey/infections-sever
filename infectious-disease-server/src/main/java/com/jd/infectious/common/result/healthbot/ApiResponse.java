package com.jd.infectious.common.result.healthbot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {

    private String code;

    private String msg;

    // list of
    private String data;

}
