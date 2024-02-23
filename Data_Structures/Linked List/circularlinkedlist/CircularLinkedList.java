package com.swamy3697.circularlinkedlist;


public class CircularLinkedList<T> {

    Node head;
    Node tail;

    public CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public  void insertNode(T data){
      if(this.head==null){
          Node node=new Node(data);
          head=node;
          tail=node;
          tail.next=head;
          head.pre=tail;
          return;
      }
      Node node=new Node(data);
      this.tail.next=node;
      node.pre=this.tail;
      this.tail=this.tail.next;
      this.tail.next=head;
      head.pre=this.tail;

    }
    public  void updateNodeByPosition(int position){

    }
    public  void updateNodeByData(T data){

    }
    public  void deleteNodeByPosition(int position){

    }
    public  void deleteNodeByData(T data){

    }
    public void print(){
        Node tempHead=this.head.next;
        while (tempHead!=null){
            System.out.print(tempHead.data);
            tempHead=tempHead.next;
        }
    }

}
