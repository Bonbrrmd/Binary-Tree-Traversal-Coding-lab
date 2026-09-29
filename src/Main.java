import java.io.PrintStream;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        
         t.root = new Node(10);
         t.root.left = new Node (5);
         t.root.left.left = new Node (2);
         t.root.left.right = new Node (7);
         t.root.right = new Node (15);
         t.root.right.right = new Node (12);
         
    
    List<Integer> in = new LinkedList<>();
    List<Integer> pre = new LinkedList<>();
    List<Integer> post = new LinkedList<>();
    
        t.inorder(t.root, in);
        t.preorder(t.root, pre);
        t.postorder(t.root, post);
        
         System.out.println("Inorder Traversal: " + in);
         System.out.println("Preorder Traversal: " + pre);
         System.out.println("Post Traversal: " + post);
         System.out.println("Level Order Traversal: " + t.levelOrder(t.root) );
    }
}
