package list.linkedlist.implementation;

import org.w3c.dom.Node;


public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public Object remove(int k) {
        if (k == 0) {
            return removeFirst();
        } else if (k == size) {
            tail = node(k - 1);
            node(k - 1).next = null;
            return node(k - 1).data;

        } else {
            node(k - 1).next = node(k + 1);
            size--;
            return node(k - 1).data;
        }
    }

    public Object removeLast() {
        return remove(size - 1);
    }


    public class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {
        Node newnode = new Node(input);
        newnode.next = head;
        head = newnode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        Node newnode = new Node(input);
        if (tail == null) {
            head = newnode;
        } else {
            tail.next = newnode;
        }
        size++;
        tail = newnode;
    }

    public Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void add(int k, Object input) {
        if (k == 0) {
            addFirst(input);
        } else {
            Node newNode = new Node(input);
            //Node temp1 = node(k-1);
            //Node temp2 = temp1.next;
            //temp1.next = newNode;
            //newNode.next=temp2;
            newNode.next = node(k);
            node(k - 1).next = newNode;
            size++;
            if (newNode.next == null) {
                tail = newNode;
            }

        }

    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        String str = "[";
//        for(int i=0; i<size;i++){
//            str+=node(i).data+", ";
//        }
        while (temp.next != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;

        return str + "]";
    }

    public Object removeFirst() {
        Node temp = head;
        head = head.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    public int size() {
        return size;
    }

    public Object get(int k) {
        Node temp = node(k);
        return temp.data;
    }
    public int indexOf(Object data){
        Node temp = head;
        int index = 0;
        while(temp.data!=data){
            temp = temp.next;
            index++;
            if(temp==null){
                return -1;
            }
        }
        return index;
    }
    public ListIterator listIterator(){
        return new ListIterator();
    }

    class ListIterator{
        private Node next;
        private Node lastReturned;
        private int nextIndex;
        ListIterator(){
            next = head;
        }
        public Object next(){
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.data;
        }
        public boolean hasNext(){
            return nextIndex<size();
        }
    }

}
