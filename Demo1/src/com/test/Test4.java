package com.test;

public class Test4 {
    public static void main(String[] args){
        Parent parent=new Child();
        System.out.println( parent.a);
        Parent parent1=new Child();
        System.out.println( ((Child)parent1).a);
        Parent parent2=new Child();
        parent2.test();
        Parent parent3=new Child();
        ((Child)parent3).test();
    }
}
