package com.ft.dubbo;

/**
 * Created by Administrator on 2018\8\16 0016.
 */
public class DemoServerImp implements IDemoService{

    @Override
    public String startDemo(String msg) {
        return "dubbo-spi"+msg;
    }
}
