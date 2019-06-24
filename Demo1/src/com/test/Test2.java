package com.test;

public class Test2 {
    public boolean equals(Object other) {
        System.out.println("use Demo equals.");
        return true;
    }


    public static void main(String[] args) {
        Object o1 = new Test2();
        Object o2 = new Test2();


        Test2 o3 = new Test2();
        Test2 o4 = new Test2();


        if (o1.equals(o2)) {
            System.out.println("o1 is equal with o2.");
        }


        if (o3.equals(o4)) {
            System.out.println("o3 is equal with o4.");
        }
    }
}
