package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itheima.mapper")// 扫描Mapper文件所在包
public class SpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }

}
