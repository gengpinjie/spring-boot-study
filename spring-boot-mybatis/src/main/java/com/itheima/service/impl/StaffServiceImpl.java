package com.itheima.service.impl;

import com.itheima.domain.Staff;
import com.itheima.mapper.StaffMapper;
import com.itheima.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements IStaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<Staff> queryAll() {
        return this.staffMapper.queryAll();
    }
}
