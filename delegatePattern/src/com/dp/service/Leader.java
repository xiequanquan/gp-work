package com.dp.service;

/**
 * @author XQQ
 * @create 2019-03-15 17:56
 * @desc 受委托者，经理
 **/
public class Leader {

    /**
     * 经理开会布置可执行计划
     *
     * @param name
     */
    public void say(String name) {

        //执行者01
        ItEmployee itEmployee = new ItEmployee();
        System.out.println(itEmployee.execute(name));

        //执行者02
        AtEmployee atEmployee = new AtEmployee();
        System.out.println(atEmployee.execute(name));

    }
}
