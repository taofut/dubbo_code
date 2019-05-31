package com.ft.dubbo;

/**
 * Created by Administrator on 2018\8\16 0016.
 */
public class DemoServerImp2 implements IDemoService{

    @Override
    public String startDemo(String msg) {
        return "dubbo多版本支持2.0"+msg;
    }
}
