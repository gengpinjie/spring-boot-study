package com.itheima.service.impl;

import com.itheima.domain.Customer;
import com.itheima.repository.CustomerRepository;
import com.itheima.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }
}
