package com.wgc.persons.entity.proxyPattern.dynamicProxy;

import java.lang.reflect.Proxy;

public class JDKTest {

    public static void main(String[] args) {
        /*
         * 进入方法的打印名字
         * 进入方法的时间
         * 如果出现异常了，要处理*/
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try {
            Action cheater = (Action) Proxy.newProxyInstance(
                    loader, Girl.class.getInterfaces(),
                    new JdkSingProxyGenerator(new Girl())
            );
            cheater.sleep();
        } catch (ClassCastException e) {
            System.out.println("委托的类要基于接口的形式。");
        } catch (Exception e) {
            System.out.println("反正我也不知道写什么好");
        }

    }
}
