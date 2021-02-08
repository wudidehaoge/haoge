package com.me.testJVM;

import java.util.ArrayList;
import java.util.List;

public class Demo7 {

    private static Integer count = 1;


    public static void main(String[] args) {
        // 栈溢出
        /*count ++;
        System.out.println(count);
        main(args);*/

        // 堆溢出
        List<User> users= new ArrayList<>();
        while(true){
            System.out.println(count++);
            users.add(new User());
        }
    }

    static class User{
        private int id;
        private String name;
    }

}
