package com.swamy3697.doublelinkedlist;

public class DoubleLinkedList<T> {
    Node head;
    Node tail;
    public DoubleLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public  void insertNode(T data){
        if(this.head==null){
            Node node=new Node(data);
            head=node;
            this.tail=head;
            System.out.println("inserted");
            return;
        }
        Node node=new Node(data);
        this.tail.next=node;
        node.pre=this.tail;
        this.tail=tail.next;

    }
    public  void updateNodeByPosition(int position){

    }
    public  void updateNodeByData(T data){

    }
    public  void deleteNodeByPosition(int position){

    }
    public  void deleteNodeByData(T data){

    }
    public  void printlinkedFromStart(){
        Node tempHead=this.head;

        while(tempHead!=null){
            System.out.print(tempHead.data+"-->");
            tempHead=tempHead.next;
        }
        System.out.println();
    }
    public  void printlinkedFromEnd(){
        Node tempTail=this.tail;
        while(tempTail!=null){
            System.out.print(tempTail.data+"<--");
            tempTail=tempTail.pre;
        }
        System.out.println();

    }
}
