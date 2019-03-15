package com.dp.test;

import com.dp.service.Leader;

/**
 * @author XQQ
 * @create 2019-03-15 17:56
 * @desc 老板（委托者）
 **/
public class Boss {

    public static void main(String[] args) {

        //经理（受委托者）
        Leader leader = new Leader();
        leader.say("WEB项目");

        System.out.println("老板收到结果");
    }
}
