package com.waq.structure.link;

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
        myLink.delete(0);
        myLink.print();

    }

    private Node head = null;

    // 增加节点
    public void add(int data) {

        Node node = new Node();
        node.setData(data);
        node.setNext(head);
        head = node;

    }

    // 删除节点
    public void delete(int index) {

        Node preNode = find(index - 1);
        Node nextNode = find(index + 1);
        Node node = find(index);

        if (node.getNext() != null) {

            if (index == 0) {
                head = node.getNext();
            } else {
                preNode.setNext(nextNode);
            }

        } else {
            preNode.setNext(null);
        }

    }

    // 查找节点
    public Node find(int index) {

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;

    }

    // 显示全部
    public void print() {

        while (head != null) {

            System.out.println(head.getData());
            head = head.getNext();

        }

    }

}
