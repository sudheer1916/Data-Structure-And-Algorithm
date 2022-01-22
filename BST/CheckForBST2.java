//if it a BST, then the inorder traversal should be sorted 
//                                                in increasing order.

public class CheckForBST2 {
    static int prev = Integer.MIN_VALUE;
    static boolean isBST(Node root){        //efficient O(n) A.s =  O(h)
        if(root == null)
        return true;
        if(isBST(root.left) == false) 
        return false;
        if(root.key <= prev)
        return false;
        prev = root.key;

        return isBST(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(4);  
        root.left = new Node(2);  
        root.right = new Node(5);  
        root.left.left = new Node(1);  
        root.left.right = new Node(3);  
          
        if (isBST(root)) 
            System.out.println("IS BST"); 
        else
            System.out.println("Not a BST");
    }
}
