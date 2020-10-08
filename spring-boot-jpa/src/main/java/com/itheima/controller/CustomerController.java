package com.itheima.controller;

import com.itheima.domain.Customer;
import com.itheima.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/list")
    public List<Customer> findAll() {
        return this.customerService.findAll();
    }

}
