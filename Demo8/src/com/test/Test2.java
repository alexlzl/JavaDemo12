package com.test;

public class Test2 {
    public static void main(String[] args){
        /**
         * false
         * **********
         * false //虽然执行了s1.intern(),但它的返回值没有赋给s1
         * true //说明s1.intern()返回的是常量池中”kvill”的引用
         * true
         */
        String s0="kvill";
        String s1=new String("kvill");
        String s2=new String("kvill");
        System.out.println( s0==s1 );//false
        System.out.println( "**********" );
        s1.intern();
        s2=s2.intern(); //把常量池中“kvill”的引用赋给s2
        System.out.println( s0==s1);//false
        System.out.println( s0==s1.intern() );//true
        System.out.println( s0==s2 );//true
    }
}
