package com.swamy3697.doublelinkedlist;

public class Node<T> {
    Node pre;
    T data;
    Node next;
    public Node(T data) {
        this.pre = null;
        this.data = data;
        this.next = null;
    }



}
