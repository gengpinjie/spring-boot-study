package com.itheima.mapper;

import com.itheima.domain.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface StaffMapper {

    public abstract List<Staff> queryAll();

}
