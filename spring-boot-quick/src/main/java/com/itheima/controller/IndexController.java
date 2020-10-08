package com.itheima.controller;

import com.itheima.config.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(PersonProperties.class)
@RequestMapping("/index")
public class IndexController {

    @Value("${name}")
    private String name;

    @Autowired
    private PersonProperties personProperties;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("name:" + name);
        System.out.println("person.name:" + personProperties.getName());
        System.out.println("person.age:" + personProperties.getAge());
        System.out.println("person.habits:" + personProperties.getHabits());
        return "Hello World Spring Boot!";
    }

}
