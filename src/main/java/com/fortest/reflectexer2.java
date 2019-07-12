package com.fortest;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 反射，获得一个对象的所有函数，然后查找到含某个名字的函数
 * 比如String 海有equal的方法
 */
public class reflectexer2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<?> c = String.class;
        System.out.println(c.getMethods().length);
        searchName(c,"equal");



    }
    public static void searchName(Class<?> c,String str) throws IllegalAccessException, InstantiationException {
        String ss = (String)c.newInstance();
        Method[] methods = c.getMethods();
        String[] names = new String[methods.length];
        int i=0;
        for(Method m:methods){
            names[i]=m.getName();
            i++;
        }
        for(int j=0;j< names.length;j++){
            int index = 0;
            if((index=(names[j].indexOf(str)))!=-1){
                System.out.println(names[j]);
            }
        }
    }
    public static void hello(Method method){
        System.out.println(method.getName());
    }

}
