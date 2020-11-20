package com.wb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.wb.mapper")
public class UserMap {
    public static void main(String[] args) {
        SpringApplication.run(UserMap.class);
    }

}
