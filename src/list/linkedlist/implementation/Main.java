package list.linkedlist.implementation;

public class Main {

    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addFirst(30);
        numbers.addFirst(40);
        numbers.addLast(20);
        numbers.addLast(10);
        numbers.add(2, 15);
        System.out.println(numbers.node(3));
        System.out.println(numbers.remove(3));
        System.out.println(numbers.removeLast());
        System.out.println(numbers);
    }
}
