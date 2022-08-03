public class NodeDouble {
    private int data;
    private Node prevNode;
    private Node nextNode;

    public NodeDouble(int data){
        this.data = data;
        this.prevNode = null;
        this.nextNode = null;
    }

    public int getData(){
        return this.data;
    }

    public Node getPrevNode(){
        return this.prevNode;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setPrevNode(Node prevNode){
        this.prevNode = prevNode;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
}
