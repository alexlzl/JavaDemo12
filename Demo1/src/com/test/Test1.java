package com.test;

public class Test1 {
   private static int a;
    private static int b;
    public static void main(String [] args){
        for(int i=0;i<100;i++){
//            a=a++;
            a++;
            System.out.println(a);
        }
        System.out.println(a);

        for(int i=0;i<100;i++){
            b=++b;
        }
        System.out.println(b);
    }
}
