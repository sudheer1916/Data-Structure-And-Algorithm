/**
 * Height of Binary Tree is the number of nodes between the 
 * longest path from root to leaf node(including the root and leaf node).
 */
class HeightOfBinaryTree {
    static int height(BTreeNode root){      //O(n)  A.s = O(h)
        if(root == null)
        return 0;
        else 
        return Math.max(height(root.left), height(root.right))+1;
    }
    public static void main(String[] args) {
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(20);
        root.right = new BTreeNode(30);
        root.right.left = new BTreeNode(40);
        root.right.right = new BTreeNode(50);
    	
    	System.out.print(height(root));
    }
}
