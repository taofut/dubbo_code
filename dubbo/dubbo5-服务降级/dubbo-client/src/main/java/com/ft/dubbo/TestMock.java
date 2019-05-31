package com.ft.dubbo;

/**
 * Created by Administrator on 2018\8\25 0025.
 */
public class TestMock implements IDemoService{

    @Override
    public String startDemo(String s) {
        return "系统异常："+s;
    }
}
