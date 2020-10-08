package com.itheima;

import com.itheima.domain.Customer;
import com.itheima.repository.CustomerRepository;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Redis测试案例
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    @Transactional
    public void test() {
        //1、从redis种获取数据,数据的形式是json字符串
        String value = this.redisTemplate.opsForValue().get("customer");
        //2、判断redis中是否存在数据
        if (StringUtils.isBlank(value)) {
            //3、不存在数据,从数据库查询
            Customer customer = this.customerRepository.getOne(2L);
            //4、将查询出来的数据存储到redis缓存中
            this.redisTemplate.opsForValue().set("customer", customer.toString());
            System.out.println("redis中不存在数据,从数据库查询!");
        } else {
            //4、将数据在控制台打印
            System.out.println("客户编码:" + value);
        }
    }

}
