package com.example.demo.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.example.demo.vo.HelloWorldVo");
        //getDeclaredFields();返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段，包括公共、保护、默认（包）访问和私有字段，但不包括继承的字段。
        Field[] field = clazz.getDeclaredFields();
        System.out.println("---------------------显示类的属性----------------------------");
        for (Field f : field) {
            //getName()返回此 Field 对象表示的字段的名称
            //getType()返回一个 Class 对象，它标识了此 Field 对象所表示字段的声明类型。
            System.out.println(f.getName() + "        " + f.getType());
        }
        System.out.println("---------------------显示类的方法-----------------------------");
        //getDeclaredMethods() 返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。
        Method[] method = clazz.getDeclaredMethods();
        for (Method m : method) {
            System.out.println(m.getName());
        }

        System.out.println("---------------------显示类的注解-----------------------------");
        for (Annotation annotation : clazz.getAnnotations()){
            System.out.println(annotation.toString());
        }


    }

}
