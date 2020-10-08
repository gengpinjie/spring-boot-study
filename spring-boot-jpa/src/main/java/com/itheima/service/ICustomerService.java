package com.itheima.service;

import com.itheima.domain.Customer;

import java.util.List;

public interface ICustomerService {
    public abstract List<Customer> findAll();
}
