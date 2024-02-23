package com.swamy3697.sinlelinkedlist;

import java.util.Scanner;

public class LinkedList<T> {
    private Node head;
    private Node current;
    Scanner scanner;
    public LinkedList(T data){
        this.head=new Node(data);
        this.current=head;
        this.scanner=new Scanner(System.in);
    }

    //link the node to linkedList
    public void insert(T data){
        Node node=new Node(data);
        this.current.next=node;
        this.current=this.current.next;

    }

    // insert by taking input from user
    public void insertAll(){
        while(true){
            System.out.println("enter data if want insert node or press enter");
            String data=this.scanner.nextLine();
            if(data !=""){
                Node node=new Node(data);
                this.current.next=node;
                this.current=this.current.next;
            }
            else{
                break;
            }
        }
        System.out.println("data inserted....");

    }

    // delete the node in linkedlist by data
    public void deleteNodeByData(String message){
        if (message.equals(head.data)){
            head=null;
            System.out.println("linked list is empty");
            printLinkedList();
            return;
        }
        Node temp=this.head;
        Node pre=null;
        while(temp!=null && !(temp.data.equals(message))){
            pre=temp;
            System.out.println(pre.data);
            temp=temp.next;

        }
        pre.next=temp.next;
        System.out.println("node deleted");
        printLinkedList();


    }

    // delete the node by position
    public void deleteNodeByPosition(int position){
        Node temp=this.head;
        for(int i=1;i<position;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        printLinkedList();
    }

    //update the linkedlist by postion
    public void updateNodeByPosition(int position,String newData){
        Node temp=this.head;
        for(int i=1;i<position;i++){
            temp=temp.next;
        }
        temp.next.data=newData;
        printLinkedList();

    }

    //updates the node data by pre data
    public void updateNodeByData(T previousData,T newData){

        if (previousData.equals(head.data)){
            head.data=newData;
            System.out.println("linked list is updated");
            printLinkedList();
            return;
        }
        Node temp=this.head;
        Node pre=null;
        while(temp!=null && !(temp.data.equals(previousData))){
            temp=temp.next;

        }
        temp.data=newData;

        System.out.println("linkedlist is updated");
        printLinkedList();

    }



    // prints the all node int the linked list
    public void printLinkedList(){
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();

    }

}
