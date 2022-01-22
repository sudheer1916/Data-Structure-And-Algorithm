import java.util.*;

public class InorderTraversalIterative {
    static void inorderiter(BTreeNode root){       //theta(n)  A.s = O(h)
        Stack<BTreeNode> s = new Stack<>();
        BTreeNode curr = root;
        while (curr != null ||  s.isEmpty() == false) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.key+" ");
            curr = curr.right;
        }
    }
    public static void main(String[] args) {
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(20);
        root.right = new BTreeNode(30);
        root.left.left = new BTreeNode(40);
        root.left.right = new BTreeNode(50);

        inorderiter(root);
    }
}
