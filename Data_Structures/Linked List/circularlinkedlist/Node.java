package com.swamy3697.circularlinkedlist;

public class Node<T> {
    Node pre;
    T data;
    Node next;
    public Node(T data){
        this.pre=null;
        this.data=data;
        this.next=null;
    }
}
