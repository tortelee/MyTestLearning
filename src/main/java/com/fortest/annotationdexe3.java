package com.fortest;

import java.lang.reflect.Method;

/**
 * Instructions to the compiler:
 * @Override
 * @Deprecated
 * @SuppressWarnings
 */
public class annotationdexe3 {
    /**
     *  no longer use
     */
    @Deprecated
    public int s;

    @SuppressWarnings("deprecated")
    @Deprecated
    public void say(){
        System.out.println("nihao");
    }

    public static void main(String[] args) {
        annotationdexe3 annotationexe3 = new annotationdexe3();
        annotationexe3.s=5;

        System.out.println(annotationexe3.s);
        annotationexe3.say();

    }
}
