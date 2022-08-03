class SinglyLinkedList{
    Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void addToHead(int data){
        Node newNode = new Node(data);

        if (this.head == null){
            this.head = newNode;
        } else {
            newNode.setNextNode(this.head);
            this.head = newNode;
        }
    }

    public int removeHead(){
        Node current = this.head;
        this.head = current.getNextNode();
        return current.getData();
    }

    public void printLinkedList(){
        Node current = this.head;
        while(current != null){
            System.out.print(current.getData() + " -> ");
            current = current.getNextNode();
        }
        System.out.print("NULL \n");
    }
    
}