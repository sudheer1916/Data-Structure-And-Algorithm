class ChildrenSumProperty {
    static boolean isCSum(BTreeNode root){      //O(n)   A.s = O(h) 
        if(root == null)
        return true;
        if(root.left == null && root.right == null)
        return true;
        int sum = 0;

        if(root.left!=null)
        sum+=root.left.key;
        if(root.right!=null)
        sum+=root.right.key;
        return (root.key == sum && isCSum(root.left) && isCSum(root.right));
    }
    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(20);
    	root.left=new BTreeNode(8);
    	root.right=new BTreeNode(12);
    	root.right.left=new BTreeNode(3);
    	root.right.right=new BTreeNode(9);
    	
        System.out.print(isCSum(root));
    }
}
