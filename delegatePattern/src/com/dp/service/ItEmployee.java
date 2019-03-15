package com.dp.service;

import com.dp.intefece.Iexecute;

/**
 * @author XQQ
 * @create 2019-03-15 17:52
 * @desc 公司程序员，员工
 **/
public class ItEmployee  implements Iexecute{
    @Override
    public String execute(String name) {
        return "程序员正在做"+name;
    }
}
