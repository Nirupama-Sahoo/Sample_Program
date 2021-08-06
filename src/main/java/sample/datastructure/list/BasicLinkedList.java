package sample.datastructure.list;

public class BasicLinkedList<X> {
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList(){
        first = null;
        last = null;
        nodeCount = 0;
    }

    public int size(){
        return nodeCount;
    }
    public void add(X item){
        //this condition means we are adding something for the first time
        if(first == null ){
            first = new  Node(item);
            last = first;
        }
        //otherwise, we want to grab the last node and update it's value
        else{
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last = newLastNode;
        }
        nodeCount++;
    }

    public X remove(){
        if(first == null){
            throw new IllegalArgumentException("");
        }
        X nodeItem = first.getNodeItem();
        first = first.getNextNode();
        nodeCount--;
        return  nodeItem;
    }
    public void insert(X item, int position){
        if(size() < position){
            throw new IllegalArgumentException();
        }

        Node currentNode = first;

        for(int i = 1; i < position && currentNode != null; i++ ){
            currentNode = currentNode.getNextNode();
        }

        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(newNode);
        nodeCount++;
    }

    public X removeAt(int position){
        if(first == null){
            throw new IllegalArgumentException("");
        }
        Node currentNode = first;
        Node prevNode = first;

        for(int i = 1; i < position && currentNode != null; i++ ){
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        X nodeItem = currentNode.getNodeItem();
        prevNode.setNextNode(currentNode.getNextNode());
        nodeCount--;
        return  nodeItem;
    }

    public X get(int position){
        if(first == null){
            throw new IllegalArgumentException("");
        }
        Node currentNode = first;
        for(int i = 1; i < size() && currentNode != null ; i++){
            if(i == position){
                return currentNode.getNodeItem();
            }
            currentNode = currentNode.getNextNode();
        }
        return  null;
    }

    public int find(X item){
        if(first == null){
            throw new IllegalArgumentException("");
        }

        Node currentNode = first;
        for(int i = 1; i < size() && currentNode != null ; i++){
            if(currentNode.getNodeItem().equals(item)){
                return i;
            }
            currentNode = currentNode.getNextNode();
        }
        return  -1;
    }
    private  class Node{
        private Node nextNode;
        private X nodeItem;

        public Node(X item){
            this.nextNode = null;
            this.nodeItem = item;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public X getNodeItem() {
            return nodeItem;
        }

    }


}
