package com.dp.service;

import com.dp.intefece.Iexecute;

/**
 * @author XQQ
 * @create 2019-03-15 17:52
 * @desc 公司会计员工
 **/
public class AtEmployee implements Iexecute{
    @Override
    public String execute(String name) {
        return "会计员正在算"+name;
    }
}
