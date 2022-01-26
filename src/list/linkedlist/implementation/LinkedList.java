package list.linkedlist.implementation;

import org.w3c.dom.Node;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size=0;

    private class Node{
        private Object data;
        private Node next;
        public Node(Object input){
            this.data = input;
            this.next = null;
        }
        public String toString(){
            return String.valueOf(this.data);
        }
    }
    public void addFirst(Object input){
        Node newnode = new Node(input);
        newnode.next = head;
        head = newnode;
        size ++;
        if(head.next==null){
            tail = head;
        }
    }
    public void addLast(Object input){
        Node newnode = new Node(input);
        if(tail==null){
            head=newnode;
        }else{
            tail.next=newnode;
        }
        size++;
        tail=newnode;
    }
    public Node node(int index){
        Node x = head;
        for(int i=0;i<index;i++){
            x=x.next;
        }
        return x;
    }
}
