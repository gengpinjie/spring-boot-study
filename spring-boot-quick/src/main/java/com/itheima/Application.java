package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 生命该类是一个SpringBoot引导类
@SpringBootApplication
public class Application {

    // main是java程序入口函数
    public static void main(String[] args) {
        // run方法表示运行SpringBoot引导类 run方法参数就是SpringBoot引导类的字节码对象
        SpringApplication.run(Application.class, args);
    }

}
