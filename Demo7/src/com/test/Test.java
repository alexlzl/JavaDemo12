package com.test;

public class Test {
    public static void main(String[] strings) {
        /**
         *  为什么会出现这种情况呢？我们先看看String str1 = new String("abc");创建了几个对象，首先它在栈中创建了一个叫str1的引用对象，
         *  然后又在堆中创建了一个“abc”字符串对象。new 的时候每次都是在堆中新建一个对象，
         *  而str3和str4是用等号赋值的，也就是它们的引用指向的是一个对象。在java中有个地方叫“变量池”，
         *  像定义 str3和str4的时候，java会在“变量池”中寻找是否有已经定义过的，如果有就将引用指向它，
         *  这样，当我们使用“==”比较时由于它们是同一个对 象所以输出的是ture。Integer的道理也是一样
         * ---------------------
         */
        String str1 = new String("abc");
        String str2 = new String("abc");

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        //输出结果：
        //false
        //true

        Integer a1 = new Integer(10);
        Integer a2 = new Integer(10);

        Integer a3 = 10;
        Integer a4 = 10;

        System.out.println(a1 == a2);
        System.out.println(a3 == a4);
        /**
         *   同样的定义方法，为什么这里就输出false了？原因非常简单，
         *   在八个可以自动拆箱和装箱的基本变量中除了double和float以为都是有“变量池”的这种机制的，
         *   而double和float没有，所以出现了上面代码的情况，无论怎么定义都是两个对象
         */
        //输出结果
        //false
        //true
        Double d1 = new Double(2.0);
        Double d2 = new Double(2.0);

        Double d3 = 2.0;
        Double d4 = 2.0;

        System.out.println(d1 == d2);
        System.out.println(d3 == d4);
        //输出结果
        //false
        //false
    }
}
