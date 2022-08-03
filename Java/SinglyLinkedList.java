class SinglyLinkedList{
    Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void addToHead(String data){
        Node newNode = new Node(data);

        if (this.head == null){
            this.head = newNode;
        } else {
            newNode.setNextNode(this.head);
            this.head = newNode;
        }
    }

    public void printLinkedList(){
        Node current = head;
        while(current != null){
            System.out.print(current.getData() + " -> ");
            current = current.getNextNode();
        }
        System.out.print("NULL \n");
    }

    
}