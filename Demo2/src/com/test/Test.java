package com.test;

public class Test<A extends B> {
    //<？>示例
//我们可以确定具体类型时，直接使用具体类型
    B<Integer> integerList = new B<Integer>();
    //我们不能确定具体类型时，可以使用通配符
    B<? extends Number> numberList = null;
//我们能够确定具体类型时，再实例化成具体类型
//    numberList = new Demo1<Integer>();
//    numberList = new Demo1<Double>();

}
