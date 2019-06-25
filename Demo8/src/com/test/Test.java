package com.test;

/**
 * http://www.voidcn.com/article/p-wullxhcz-zg.html
 */
public class Test {
    public static void main(String[] args) {

        String str1 = new StringBuilder("hel").append("lo").toString();

        String str2 = new StringBuilder("ja").append("va").toString();

        /**
         * str1的结果是很多人都能理解的，但是str2的结果为false就说明，常量池中已经有了"java"了，
         * 这里很多人不解，这个就是系统装入的字符常量，
         * 除了"java"，类似的还有"false","true"(在java.lang.String里)等等。
         */
        System.out.println(str1.intern() == str1);//TRUE

        System.out.println(str2.intern() == str2);//FALSE

        String s0="kvill";
        String s1="kvill";
        String s2="kv" + "ill";
        System.out.println( s0==s1 );//true
        System.out.println( s0==s2 );//true


        String ss0="kvill";
        String ss1=new String("kvill");
        String ss2="kv" + new String("ill");
        System.out.println( ss0==ss1 );//false
        System.out.println( ss0==ss2 );//false
        System.out.println( ss1==ss2 );//false

    }
}
