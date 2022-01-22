//Size of Binary Tree is the total numbers of nodes present in that Tree.
class SizeOfBinaryTree {
    static int getSize(BTreeNode root){     //Ts = O(n) As = O(h+1)
        if(root == null)
        return 0;
        else
        return 1+getSize(root.left)+getSize(root.right);
    }
    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(10);
    	root.left=new BTreeNode(20);
    	root.right=new BTreeNode(30);
    	root.left.left=new BTreeNode(40);
    	root.left.right=new BTreeNode(50);
        root.right.left = new BTreeNode(60);
    	root.right.right=new BTreeNode(70);

        System.out.println(getSize(root));
    }
}
