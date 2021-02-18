package com.waq.structure;

/**
 * 自己写一个链表
 * 采用头插法
 */

public class MyLink {

    public static void main(String[] args) {

        MyLink myLink = new MyLink();
        myLink.add(1);
        myLink.add(2);
        myLink.add(3);
        myLink.add(4);
        myLink.add(5);
        System.out.println(myLink.get(4));

    }

    private Node head = null;

    public void add(int data) {

        Node node = new Node();
        node.setData(data);
        node.setNext(head);
        head = node;

    }

    public Integer get(int index) {

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getData();

    }

}
