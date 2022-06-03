class Node {
    private String data;
    private Node nextNode;

    public Node(String data){
        this.data = data;
        this.nextNode = null;
    }

    public String getData(){
        return this.data;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setData(String data){
        this.data = data;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
}