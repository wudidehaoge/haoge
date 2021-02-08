package com.me.testJVM;

public class Demo5 {

    // 递归  耗费内存  时间久
    public static Integer f(Integer n){
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        if(n == 1 || n == 2){
            return n;
        }
        return f(n-1) + f(n-2);
    }

    // 循环  非递归
    public static Integer loop(Integer n){
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        if(n == 1 || n == 2){
            return n;
        }
        int one = 2;
        int two = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = one + two;
            two = one;
            one = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer n = 40;

        Long start = System.currentTimeMillis();
        System.out.println(f(n));
        Long end = System.currentTimeMillis();
        System.out.println(end-start);

        Long start1 = System.currentTimeMillis();
        System.out.println(loop(n));
        Long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);
    }
}
