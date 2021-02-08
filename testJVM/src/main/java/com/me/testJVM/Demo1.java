package com.me.testJVM;

public class Demo1 {

    private static int a = 1;

    static{
        a = 2;
        b = 3;
    }

    private static int b = 5;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
