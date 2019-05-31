package com.ft.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2018\8\16 0016.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("dubbo-server.xml");
        applicationContext.start();
        System.in.read();
    }
}
