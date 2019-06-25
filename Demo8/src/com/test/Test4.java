package com.test;

public class Test4 {
    public static void main(String[] args){

        String str2 = "SEUCalvin";//新加的一行代码，其余不变
        String str1 = new String("SEU")+ new String("Calvin");
        System.out.println(str1.intern() == str1);//false
        System.out.println(str1 == "SEUCalvin");//false

    }

    static{
        i=0;//給变量赋值，可以通过编译
//        System.out.print(i);//这句编译器会提示非法向前引用
    }
    static int i=1;
    public static void test(){
        System.out.print(i);//这句编译器会提示非法向前引用
    }

}
