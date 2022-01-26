package list.linkedlist.implementation;

public class Main {

    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addFirst(30);
        numbers.addFirst(40);
        numbers.addLast(20);
        numbers.addLast(10);
        System.out.println(numbers.node(3));
    }
}
