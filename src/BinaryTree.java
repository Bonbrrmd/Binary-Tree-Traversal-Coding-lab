
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


  public class BinaryTree {
    Node root;
    
    public void inorder(Node n, List<Integer> out) {
       if (n == null) {  
           return;
       }
           inorder(n.left, out);
           out.add(n.data);
           inorder(n.right, out);
           
} 
    public void preorder(Node n, List<Integer> out ) {
      if (n == null) {
          return;
      } 
      out.add(n.data);
        preorder(n.left, out);
        preorder(n.right, out);
    } 
    public void postorder(Node n, List<Integer> out) {
        if (n == null) {
            return;
        }
        postorder(n.left, out);
        postorder(n.right, out);
        out.add(n.data);
    }

public List<Integer> levelOrder(Node n) {
    List<Integer> out = new ArrayList<>();
    if (n == null) {
        return out;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(n);

    while (!queue.isEmpty()) {
        Node current = queue.poll();
        out.add(current.data); 

        if (current.left != null) {
            queue.add(current.left);
        }
        if (current.right != null) {
            queue.add(current.right);
        }
    }

    return out;
}

}
           




