public class NodeDouble {
    private int data;
    private NodeDouble prevNode;
    private NodeDouble nextNode;

    public NodeDouble(int data){
        this.data = data;
        this.prevNode = null;
        this.nextNode = null;
    }

    public int getData(){
        return this.data;
    }

    public NodeDouble getPrevNode(){
        return this.prevNode;
    }

    public NodeDouble getNextNode(){
        return this.nextNode;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setPrevNode(NodeDouble prevNode){
        this.prevNode = prevNode;
    }

    public void setNextNode(NodeDouble nextNode){
        this.nextNode = nextNode;
    }
}
