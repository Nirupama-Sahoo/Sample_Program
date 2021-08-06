package sample.datastructure.list;

public class BasicLinkedList2 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;
    private Node prev = null;
    private void insertNode(int data){
        Node newNode = new Node(data);
        System.out.print(data + "->");
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

    }

    private boolean searchNode(int value){
        Node ptr = head;
       while(ptr != null){
           if(ptr.data == value){
               return true;
           }
           ptr = ptr.next;
       }
        return false;
    }

    private void deleteNode(int value){
        System.out.println("Delete Node "+ value);
        Node ptr = head;
        if(searchNode(value)){
            if(ptr != null && ptr.data == value){
                head = ptr.next;
                return;
            }
            while(ptr != null && ptr.data != value ){
                prev = ptr;
                ptr = ptr.next;

            }
            prev.next  = ptr.next;
            if(ptr == null)
                return;
        } else{
            System.out.println ("Element "+ value +" is not present in LinkedList");
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
    public static void main(String args[]){
        BasicLinkedList2 inLinkedList = new BasicLinkedList2();
        inLinkedList.insertNode(1);
        inLinkedList.insertNode(2);
        inLinkedList.insertNode(3);
        inLinkedList.insertNode(4);
        System.out.println("NULL");

        System.out.println("Found the element 3 :"+ inLinkedList.searchNode(3));
        System.out.println("Found the element 5 :"+ inLinkedList.searchNode(5));

        inLinkedList.deleteNode(3);
        inLinkedList.deleteNode(5);
        System.out.println("After Deletion");
        inLinkedList.printList(inLinkedList.head);

    }
}
