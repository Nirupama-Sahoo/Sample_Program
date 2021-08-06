package sample.datastructure.binarytree;

public class BTTraversal {
    static void inOrderTraverBT(Node node){
        if(node == null) {
            return;
        }
        inOrderTraverBT(node.left);
        System.out.print(node.data+ "  ");
        inOrderTraverBT(node.right);

    }

    public static void main(String args[]){
        Node root = new Node(13);
        root.left = new Node(10);
        root.right = new Node(18);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.left.right.left = new Node(11);
        root.left.right.right = new Node(16);
        root.right.right = new Node(20);
        System.out.println("InOrder Traversal");
        inOrderTraverBT(root);

    }
}
