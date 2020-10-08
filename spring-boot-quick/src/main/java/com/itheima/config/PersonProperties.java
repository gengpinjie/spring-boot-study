package com.itheima.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "person")
public class PersonProperties {

    private String name;
    private int age;
    private List<String> habits;

}
