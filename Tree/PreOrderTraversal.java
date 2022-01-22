//implementation of Preorder Traversal       (root->left->right)
class PreOrderTraversal {
    static void preorder(BTreeNode root){       //theta(n)
        if(root != null){
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args) {
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(20);
        root.right = new BTreeNode(30);
        root.right.left = new BTreeNode(40);
        root.right.right = new BTreeNode(50);

        preorder(root);
    }
}
