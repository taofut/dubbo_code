package com.ft.dubbo;

import com.ft.spi.DataBaseDriver;

import java.util.ServiceLoader;

/**
 * Created by Administrator on 2018\8\26 0026.
 */
public class DataBaseConnection {

    public static void main(String[] args) {
        ServiceLoader<DataBaseDriver> serviceLoader=ServiceLoader.load(DataBaseDriver.class);
        for(DataBaseDriver dataBaseDriver:serviceLoader){
            System.out.println(dataBaseDriver.connect("localhost"));
        }
    }
}
