package com.ft.spi;

/**
 * Created by Administrator on 2018\8\26 0026.
 */
public class OracleDriver implements DataBaseDriver {

    @Override
    public String connect(String s) {
        return "创建Oracle连接："+s;
    }
}
