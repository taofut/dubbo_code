package com.ft.dubbo.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 *
 */
public class App1 {
    public static void main(String[] args) {
        ConcurrentHashMap map=new ConcurrentHashMap();
        Object o1=map.putIfAbsent("a",123);
        System.out.println(o1);
        Object o2=map.putIfAbsent("b",123);
        System.out.println(o2);
        Object o3=map.putIfAbsent("c",1234);
        System.out.println(o3);
        Object o4=map.putIfAbsent("c",123);
        System.out.println(o4);
        System.out.println(map);
    }

}
