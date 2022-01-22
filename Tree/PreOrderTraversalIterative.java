import java.util.Stack;

public class PreOrderTraversalIterative {   
    /*static void preorder(BTreeNode root){       //O(n) A.s = O(n)
        if(root == null) return ;
        Stack<BTreeNode> s = new Stack<>();
        s.push(root);
        while (s.isEmpty() == false) {
            BTreeNode curr = s.pop();
            System.out.print(curr.key+" ");
            if(curr.right != null) 
                s.push(curr.right);
            if(curr.left != null)
                s.push(curr.left);
        }
    }*/
    static void preorder(BTreeNode root){       //space Optimized
        if(root == null) return ;               //O(n)  A.s = O(h)
        Stack<BTreeNode> s =new Stack<>();
        BTreeNode curr = root;
        while (curr != null || s.isEmpty() == false) {
            while (curr != null) {
                System.out.print(curr.key+" ");
                if(curr.right != null)
                    s.push(curr.right);
                curr = curr.left;
            }
            if(s.empty() == false){
                curr = s.peek();
                s.pop();
            }
        }
    }
    public static void main(String[] args) {
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(20);
        root.right = new BTreeNode(30);
        root.left.left = new BTreeNode(40);
        root.left.right = new BTreeNode(50);
        root.right.left = new BTreeNode(60);
        preorder(root);
    }
}
