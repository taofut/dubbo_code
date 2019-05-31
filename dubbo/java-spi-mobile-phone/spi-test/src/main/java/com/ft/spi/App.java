package com.ft.spi;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ServiceLoader<MobilePhone> serviceLoader=ServiceLoader.load(MobilePhone.class);
        for(MobilePhone mobilePhone:serviceLoader){
            System.out.println(mobilePhone.sendMsg("你好，spi!"));
        }
    }

}
