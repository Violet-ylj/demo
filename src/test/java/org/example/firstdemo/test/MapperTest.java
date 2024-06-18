package org.example.firstdemo.test;

import org.example.firstdemo.demos.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MapperTest {

    @Resource
    private TestMapper testMapper;

    @Test
    public void test1(){
        String name;
        name = testMapper.getNameById(2);
        System.out.println("查询结果 name="+name);
    }

}
