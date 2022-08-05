public class DoublyLinkedList {
    private NodeDouble head;
    private NodeDouble tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public NodeDouble getHead() {
        return head;
    }
    public void setHead(NodeDouble head) {
        this.head = head;
    }

    public NodeDouble getTail() {
        return tail;
    }

    public void setTail(NodeDouble tail) {
        this.tail = tail;
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

    public int deleteNode(int pos){
        NodeDouble current = this.head;
        int counter = 1;

        if (pos == 0){
            return this.removeHead();
        }

        while (counter != pos){

            if (current == null){
                return -1;
            }
            current = current.getNextNode();
            counter++;
        }

        NodeDouble prev = current.getPrevNode();
        NodeDouble next = current.getNextNode();

        prev.setNextNode(next);
        next.setPrevNode(prev);
        return current.getData();

    }

    public int search(int data){
        NodeDouble current = this.head;
        int counter = 0;
        while (current != null){
            if (current.getData() == data){
                return counter;
            } else {
                current = current.getNextNode();
                counter++;
            }
        }
        return -1;
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
