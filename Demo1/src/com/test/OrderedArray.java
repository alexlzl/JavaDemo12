package com.test;

public class OrderedArray {
    private static long[] a=new long[10];
    private static int size=10; //数组的大小
    private  static int nElem; //数组中有多少项

    public OrderedArray(int max) { //初始化数组
        this.a = new long[max];
        this.size = max;
        this.nElem = 0;
    }

    public int size() { //返回数组实际有多少值
        return this.nElem;
    }

    //--------------二分法查找某个值----------------//
    public static int find(long searchNum) {
        int lower = 0;
        int upper = nElem - 1;
        int curr;
        while (true) {
            curr = (lower + upper) / 2;
            if (a[curr] == searchNum)
                return curr;
            else if (lower > upper)
                return -1;
            else {
                if (a[curr] < searchNum)
                    lower = curr + 1;
                else
                    upper = curr - 1;
            }

        }
    }

    public static boolean insert(long value) { //插入某个值
        if (nElem == size) {
            System.out.println("数组已满！");
            return false;
        }
        int j;
        for (j = 0; j < nElem; j++) {
            if (a[j] > value)
                break;
        }

        for (int k = nElem; k > j; k--) {
            a[k] = a[k - 1];
        }
        a[j] = value;
        nElem++;
        return true;
    }

    public boolean delete(long value) { //删除某个值
        int j = find(value);
        if (j == -1) {
            System.out.println("没有该元素！");
            return false;
        }
        if (nElem == size) {
            for (int k = j; k < nElem - 1; k++) {
                a[k] = a[k + 1];
            }
            a[nElem - 1] = 0;
        } else {
            for (int k = j; k < nElem; k++) {
                a[k] = a[k + 1];
            }
        }
        nElem--;
        return true;
    }

    public static void display() { //打印整个数组
        for (int i = 0; i < nElem; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }


    public static void main(String[] args){
        for(int i=0;i<10;i++){
            insert(i);
        }
        display();
        find(5);
    }

}
