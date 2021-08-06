package sample.datastructure.list;

public class MergeTwoShortedLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node Merge_List(Node first,Node second, Node temp){
        Node new_list = null;
        if(first == null){
            return second;
        }
        if(second == null){
            return first;
        }if(first.data <= second.data){
            temp = first;
            first = first.next;
        }
        else{
            temp = second;
            second = second.next;
        }
        new_list = temp;

        while(first != null && second != null){
            if(first.data <= second.data){
                temp.next = first;
                temp = first;
                first = temp.next;
            }else{
                temp.next = second;
                temp = second;
                second = temp.next;
            }
        }
        if(first == null)
            temp.next = second;
        if(second == null)
            temp.next = first;
        return new_list;
    }
    public static void main(String args[]){

    }
}
