package sample.string;

public class PrintFirstNonRepeatedChar {
    private static void findFirstNonRepeatedChar(char ch){
        int position = ch;
        Node ascii[] = new Node[256];
        Node tail = null;
        Node head = null;

        if(ascii[position].ch == ' '){
            System.out.println("Character is already repeated");
        }else if(ascii[position] != null){
            Node current = new Node(ch);
            Node prev = current.prev;
            prev.next = current.next;
            current.next.prev = prev;
            current = null;
            ascii[position].ch = ' ';

        }else{
            Node node = new Node(ch);
            ascii[position] = node;
            head = node;
            tail.next = node;
            tail = tail.next;

        }
        System.out.print(head.ch);

    }
    public static void main(String args[]){

    }
}
class Node{
    char ch;
    Node next;
    Node prev;
    Node(char ch){
        this.ch = ch;
        this.next = null;
        this.prev = null;
    }
}