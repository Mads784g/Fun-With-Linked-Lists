public class Main {
    public static void main(String[] args) {
        //Singly linked list tests:
        System.out.println("Singly linked list:");
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToHead(1);
        list.addToHead(2);
        list.printLinkedList();

        System.out.println("Popped node contained " + list.removeHead() + ".");
        list.printLinkedList();

        //Doubly linked list tests:
        System.out.println("Doubly linked list:");
        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.addToHead(1);
        list2.addToHead(2);
        System.out.println("Head = " + list2.getHead().getData() + " Tail = " + list2.getTail().getData() + ".");

        list2.addToTail(3);
        list2.addToTail(4);
        System.out.println("Head = " + list2.getHead().getData() + " Tail = " + list2.getTail().getData() + ".");
        list2.printLinkedList();

        System.out.println("Popped node contained " + list2.removeHead() + ".");
        list2.printLinkedList();

        System.out.println("Popped node contained " + list2.removeTail() + ".");
        list2.printLinkedList();

        System.out.println("inserting nodes:");
        list2.insertNode(2, 0);
        list2.printLinkedList();
        list2.insertNode(5, 1);
        list2.printLinkedList();
        list2.insertNode(7, 10);
        list2.printLinkedList();
        list2.insertNode(6, 6);
        list2.printLinkedList();

        System.out.println("Deleting nodes:");
        System.out.println("Popped node contained " + list2.deleteNode(0) + ".");
        list2.printLinkedList();
        System.out.println("Popped node contained " + list2.deleteNode(3) + ".");
        list2.printLinkedList();
        System.out.println("Popped node contained " + list2.deleteNode(100) + ".");
        list2.printLinkedList();

        System.out.println("Searching:");
        System.out.println("5 located at pos: " + list2.search(5));
        System.out.println("1 located at pos: " + list2.search(1));
        System.out.println("6 located at pos: " + list2.search(6));
        System.out.println("100 located at pos: " + list2.search(100));

  


    }
}
