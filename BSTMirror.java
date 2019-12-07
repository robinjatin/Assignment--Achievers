//Check if a BST is mirror or not
import java.util.Scanner;
public class BSTMirror {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    static Node root;
    boolean ifMirror(Node node1, Node node2){
        if (node1 == null && node2 == null)
            return true;
        if (node1 != null && node2 != null && node1.data == node2.data)
            return (ifMirror(node1.left, node2.right) && ifMirror(node1.right, node2.left));
        return false;
    }

    public static void main(String[] args) {
        BSTMirror tree = new BSTMirror();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        root = new Node(sc.nextInt());
        root.left = new Node(sc.nextInt());
        root.right = new Node(sc.nextInt());
        root.left.left = new Node(sc.nextInt());
        root.right.left = new Node(sc.nextInt());
        root.left.right = new Node(sc.nextInt());
        root.right.right = new Node(sc.nextInt());
        if (tree.ifMirror(root,root)==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
