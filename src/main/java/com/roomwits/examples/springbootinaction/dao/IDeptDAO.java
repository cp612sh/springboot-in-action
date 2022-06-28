package com.roomwits.examples.springbootinaction.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.roomwits.examples.springbootinaction.vo.Dept;

@Mapper
public interface IDeptDAO {
    @Select("SELECT deptno,dname FROM dept")
    public List<Dept> findAll();
}
