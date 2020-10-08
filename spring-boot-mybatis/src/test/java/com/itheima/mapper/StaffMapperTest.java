package com.itheima.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StaffMapperTest {

    @Autowired
    private StaffMapper staffMapper;

    @Test
    public void test() {
        this.staffMapper.queryAll().forEach(staff -> System.out.println(staff));
    }

}