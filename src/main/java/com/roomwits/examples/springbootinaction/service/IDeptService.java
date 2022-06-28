package com.roomwits.examples.springbootinaction.service;

import java.util.List;

import com.roomwits.examples.springbootinaction.vo.Dept;

public interface IDeptService {
    public List<Dept> findAll();
}
