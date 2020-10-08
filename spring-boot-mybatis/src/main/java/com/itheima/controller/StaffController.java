package com.itheima.controller;

import com.itheima.domain.Staff;
import com.itheima.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private IStaffService staffService;

    @GetMapping("/list")
    public List<Staff> queryAll() {
        return this.staffService.queryAll();
    }

}
