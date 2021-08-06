package sample.datastructure.list;

public class DoubleLinkedList {
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    private Node head = null;
    private Node tail = null;
    private void insertNode(int data){
        Node newNode = new Node(data);
        System.out.print(data + "->");
        if(head == null){
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;

        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
        }
    }
    private boolean searchElement(int element){
        Node ptr = head;
        while(ptr != null){
            if (ptr .data == element){
                return  true;
            }
            ptr = ptr.next;
        }
        return false;
    }
    private void deleteElement(int element){
        System.out.println("Delete Node "+ element);
        Node ptr = head;
        if(head == null){
            System.out.print("List is empty");
        }
        if(ptr.data == element){
            head = ptr.next;
            head.prev = null;
            return;
        }
        while(ptr != null && ptr.data != element){
            ptr = ptr.next;
        }
        ptr.next.prev = ptr.prev;
        ptr.prev.next = ptr.next;

        if(ptr == null){
            return;
        }


    }
    private void printList(Node ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }
    public static  void main(String args[]){
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    doubleLinkedList.insertNode(1);
    doubleLinkedList.insertNode(2);
    doubleLinkedList.insertNode(3);
    doubleLinkedList.insertNode(4);
    System.out.println("NULL");

    System.out.println("Element 3 is present "+ doubleLinkedList.searchElement(3));

    doubleLinkedList.deleteElement(3);
    doubleLinkedList.printList(doubleLinkedList.head);
    System.out.println("After deleting ");
    doubleLinkedList.printList(doubleLinkedList.head);

    }
}
