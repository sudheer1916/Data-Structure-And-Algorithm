//In a Balanced Binary Tree for every node, the difference between 
//heights of left subtree and right subtree should not be more than one.
class CheckForBalancedBinaryTree {
    /*static boolean isBalanced(BTreeNode root){    //naive O(n^2)
        if(root == null)
        return true;
        int lh = height(root.left);
        int rh = height(root.right);

        return (Math.abs(lh - rh)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }
    static int height(BTreeNode root){
        if(root == null)
        return 0;
        else 
        return (1+Math.max(height(root.left), height(root.right)));
    }*/

    static int isBalanced(BTreeNode root){      //efficient O(n)
        if(root == null)
        return 0;
        int lh = isBalanced(root.left);
        if(lh == -1) return -1;

        int rh = isBalanced(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh-rh)>1)
        return -1;
        else
        return Math.max(lh, rh)+1;
    }
    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(10);
    	root.left=new BTreeNode(5);
    	root.right=new BTreeNode(30);
    	root.right.left=new BTreeNode(15);
    	root.right.right=new BTreeNode(20);
    	
        //System.out.print(isBalanced(root));       //naive
        if(isBalanced(root)>0)
        System.out.print("balanced");
        else
        System.out.print(" not balanced");

    }
}
