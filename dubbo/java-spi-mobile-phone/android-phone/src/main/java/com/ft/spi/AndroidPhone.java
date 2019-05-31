package com.ft.spi;

/**
 * Created by Administrator on 2018\8\26 0026.
 */
public class AndroidPhone implements MobilePhone {

    @Override
    public String sendMsg(String s) {
        return "使用安卓手机发送了一条短信，内容为："+s;
    }
}
