package com.ft.spi;

/**
 * Created by Administrator on 2018\8\26 0026.
 */
public class MysqlDriver implements DataBaseDriver {

    @Override
    public String connect(String s) {
        return "创建mysql连接："+s;
    }
}
