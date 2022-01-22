//In Binary Tree every node has at most two children.
class BTreeNode{
    int key;
    BTreeNode left;
    BTreeNode right;
    BTreeNode(int x){
        key = x;
        //left = right = null;
    }
}
class BTreeMain{
    public static void main(String[] args) {
        //TreeNode root = null;  it means binary tree is null
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(20);
        root.right = new BTreeNode(30);
        root.left.left = new BTreeNode(40);
    }
}