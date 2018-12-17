package com.wgc.persons.entity.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkSingProxyGenerator implements InvocationHandler {

    private Object object;

    public JdkSingProxyGenerator(Object obj) {
        this.object = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            long beingTime = System.currentTimeMillis();
            System.out.println("被调用方法的名字：" + method.getName());
            System.out.println("每个人都要唱一首歌");
            Object invoke = method.invoke(object, args);
            System.out.println("进入这个方法的时间：" + (System.currentTimeMillis() - beingTime) + "毫秒");
            return invoke;
        } catch (Exception e) {
            System.out.println("你的类没有基于接口，请修改一下");
            return  null;
        }

    }
}
