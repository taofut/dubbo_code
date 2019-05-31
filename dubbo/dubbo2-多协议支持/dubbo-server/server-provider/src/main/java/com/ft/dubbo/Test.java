package com.ft.dubbo;


import com.alibaba.dubbo.container.Main;

import java.io.IOException;

/**
 * Created by Administrator on 2018\8\16 0016.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        //服务启动，加载哪些容器
        Main.main(new String[]{"spring","log4j"});
    }
}
