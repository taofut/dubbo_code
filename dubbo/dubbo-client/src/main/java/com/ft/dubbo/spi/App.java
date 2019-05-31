package com.ft.dubbo.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import com.ft.dubbo.IDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.ExceptionListener;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ClassPathXmlApplicationContext applicationContext=
//                new ClassPathXmlApplicationContext("dubbo-client.xml");
//        IDemoService demoService=(IDemoService) applicationContext.getBean("demoService");
//        System.out.println(demoService.startDemo(" taofut"));
//
//
//        Protocol protocol= ExtensionLoader.
//                getExtensionLoader(Protocol.class).getExtension("myProtocol");

        Protocol protocol=ExtensionLoader.
                getExtensionLoader(Protocol.class).getAdaptiveExtension();

        int port=ExtensionLoader.getExtensionLoader(Protocol.class).
                getDefaultExtension().getDefaultPort();
        System.out.println(port);
    }


}
