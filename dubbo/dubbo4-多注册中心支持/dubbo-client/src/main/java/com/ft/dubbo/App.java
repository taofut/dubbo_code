package com.ft.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("dubbo-client.xml");
        applicationContext.start();

        IDemoService demoService=(IDemoService) applicationContext.getBean("demoService");
        System.out.println(demoService.startDemo("dubbo，你好"));
    }
}
