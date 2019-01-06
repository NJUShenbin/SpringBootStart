package com.example.demo.dynamicProxy;

public class RealSubject implements Subject
{
    @Override
    public String hello(String str)
    {
        String s = "hello: "+str;
        System.out.println("real: "+s);
        return s;
    }
}
