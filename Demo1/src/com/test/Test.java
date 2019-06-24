package com.test;

public class Test {

    //头节点和尾节点都为空 链表为空
    static Node<String> head = null;
    static Node<String> tail = null;

    public static void main(String[] args) {
        //创建一个新的节点 并让head指向此节点
        head = new Node("nodedata1");
        //让尾节点也指向此节点
        tail = head;

        //创建新节点 同时和最后一个节点连接起来
        tail.next = new Node("node1data2");

//尾节点指向新的节点
        tail = tail.next;

        Node<String> current = head;
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }
}
