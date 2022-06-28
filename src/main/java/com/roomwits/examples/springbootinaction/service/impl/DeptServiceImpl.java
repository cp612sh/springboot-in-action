package com.roomwits.examples.springbootinaction.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roomwits.examples.springbootinaction.dao.IDeptDAO;
import com.roomwits.examples.springbootinaction.service.IDeptService;
import com.roomwits.examples.springbootinaction.vo.Dept;

@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptDAO deptDAO;

    @Override
    public List<Dept> findAll() {
        return deptDAO.findAll();
    }

}
    
