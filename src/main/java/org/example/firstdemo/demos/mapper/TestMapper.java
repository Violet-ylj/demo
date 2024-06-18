package org.example.firstdemo.demos.mapper;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    String getNameById(int id);

}
