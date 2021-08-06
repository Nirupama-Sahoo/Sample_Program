package sample.datastructure.list;

public class FindMiddleOfLinkedList {
    Node head; // head of linked list
    int size = 0;

    /* Linked list node */
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;
        size++;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* This function prints contents of linked list
       starting from  the given node */
    public void printList()
    {
       Node tNode = head;
       while(tNode != null){
           System.out.print(tNode.data+ "->");
           tNode=tNode.next;

       }
       System.out.println("NULL");
    }

    /* Function to print middle of linked list */
    void printMiddle()
    {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null)
        {
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                    slow_ptr.data + "] \n");
        }

    }
    public static void main(String args[]){
        FindMiddleOfLinkedList linkedList = new FindMiddleOfLinkedList();
        for (int i = 6; i >0 ; i-- )
        {
            linkedList.push(i);
            linkedList.printList();

        }
        linkedList.printMiddle();
        linkedList.printMiddle();
    System.out.println("Size :"+ linkedList.size);
    }
}
