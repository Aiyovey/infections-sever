package com.jd.infectious;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InfectiousDiseaseServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfectiousDiseaseServerApplication.class, args);
        System.out.println("<-------系统启动成功------->");
    }

}
