class PostorderTraversal {              //(left->right->root)
    static void postorder(BTreeNode root){      //theta(n)
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static void main(String[] args) {
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(20);
        root.right = new BTreeNode(30);
        root.right.left = new BTreeNode(40);
        root.right.right = new BTreeNode(50);

        postorder(root);
    }
}
