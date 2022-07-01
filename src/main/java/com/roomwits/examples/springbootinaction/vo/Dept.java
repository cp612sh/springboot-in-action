package com.roomwits.examples.springbootinaction.vo;

import java.io.Serializable;

public class Dept implements Serializable {
    private Long deptno;
    public Long getDeptno() {
        return deptno;
    }
    private String dname;
    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
}
