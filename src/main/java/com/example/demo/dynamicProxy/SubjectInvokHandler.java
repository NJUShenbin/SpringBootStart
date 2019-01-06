package com.example.demo.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SubjectInvokHandler implements InvocationHandler {

    private Object subject;

    public SubjectInvokHandler(Object subject)
    {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args)
            throws Throwable
    {
        System.out.println("before proxy");
        System.out.println("Method:" + method);

        // 实际调用
        String s =  (String) method.invoke(subject, args);

        System.out.println("after proxy, result="+s);
        return null;
    }

}

class DynamicProxyMain{
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();

        InvocationHandler handler = new SubjectInvokHandler(realSubject);

        //动态生成代理对象
        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(), handler);

        System.out.println(subject.getClass().getName());
        subject.hello("world");
    }
}
