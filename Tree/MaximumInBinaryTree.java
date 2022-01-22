public class MaximumInBinaryTree {
    static int getMax(BTreeNode root){      //tc = O(n) As = O(H+1)
        if(root == null)
        return Integer.MIN_VALUE;
        else
        return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
    }
    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(20);
    	root.left=new BTreeNode(80);
    	root.right=new BTreeNode(30);
    	root.right.left=new BTreeNode(40);
    	root.right.right=new BTreeNode(50);
    	
        System.out.print(getMax(root));
    }
}
