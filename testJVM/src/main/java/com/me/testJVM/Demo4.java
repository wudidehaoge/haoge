package com.me.testJVM;

import java.util.Arrays;

public class Demo4 {

    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int[] arr = {1,2,3,4,5};
        MyData my = new MyData();

        change(i,str,num,arr,my);

        // arr my变了
        System.out.println("i= " + i);
        System.out.println("str= " + str);
        System.out.println("num= " + num);
        System.out.println("arr= " + Arrays.toString(arr));
        System.out.println("my.a= " + my.a);
    }

    public static void change(int i, String str, Integer num, int[] a, MyData m) {
        i += 1;
        str += "world";
        num += 1;
        a[0] += 1;
        m.a += 1;
    }
}

class MyData {
    int a = 10;
}