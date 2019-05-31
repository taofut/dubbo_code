package com.ft.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2018\8\14 0014.
 */
public class ClusterTest1 {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("META-INF/spring/dubbo-cluster1.xml");
        applicationContext.start();
        System.in.read();
    }
}
