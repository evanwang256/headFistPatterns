package com.evan.strategy.version4;

/**
 * Created by wangzhen318 on 2017/4/13.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        //什么都不做，不会叫
        System.out.println("<< Silence >>");
    }
}
