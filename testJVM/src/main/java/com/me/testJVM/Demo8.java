package com.me.testJVM;

// Xms

public class Demo8 {

    public static void main(String[] args) {

        System.out.println("start....");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end....");

    }

}
