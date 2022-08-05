public class DoublyLinkedList {
    NodeDouble head;
    NodeDouble tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addToHead(int data){
        NodeDouble node = new NodeDouble(data);

        if (head == null){
            this.head = node;
            this.tail = node;
        } else {
            NodeDouble current = this.head;
            node.setNextNode(current);
            this.head = node;

        }
    }

    public void addToTail(int data){
        NodeDouble node = new NodeDouble(data);
        if (this.tail == null){
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNextNode(node);
            node.setPrevNode(this.tail);
            this.tail = node;
        }
    }
    
    public int removeHead(){
        if (this.head == null){
            return -1;
        } else {
            NodeDouble current = this.head;
            this.head = current.getNextNode();
            this.head.setPrevNode(null);
            return current.getData();
        }
    }

    public int removeTail(){
        if (this.tail == null){
            return -1;
        } else {
            NodeDouble current = this.tail;
            this.tail = current.getPrevNode();
            this.tail.setNextNode(null);
            return current.getData();
        }
    }

    public void insertNode(int data, int pos){
        NodeDouble newNode = new NodeDouble(data);
        if (pos == 0){
            this.addToHead(data);
        }
        int counter = 1;
        NodeDouble current = this.head;
        while (counter != pos){
            if (current == null){
                this.addToTail(data);
                return;
            }
            current = current.getNextNode();
            counter++;
        }
        newNode.setPrevNode(current);
        newNode.setNextNode(current.getNextNode());
        current.setNextNode(newNode);
        if (newNode.getNextNode() != null){
            newNode.getNextNode().setPrevNode(newNode);
        }
        
    }

    public void printLinkedList(){
        NodeDouble current = this.head;
        while(current != null){
            System.out.print(current.getData() + " -> ");
            current = current.getNextNode();
        }
        System.out.print("NULL \n");
    }





}
