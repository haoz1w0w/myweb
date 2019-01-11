package com.food;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2019/1/10 0010.
 */
@SpringBootApplication
@MapperScan("com.food.dao")
public class FoodWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoodWebApplication.class, args);

    }
}
