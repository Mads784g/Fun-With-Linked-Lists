public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToHead(1);
        list.addToHead(2);
        list.printLinkedList();

        System.out.println("Popped node contained " + list.removeHead() + ".");
        list.printLinkedList();

    }
}
