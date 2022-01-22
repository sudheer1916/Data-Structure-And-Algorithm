//Implementation of Inorder Traversal       (left->root->right)
/*a function that takes root as a parameter, 
whose return type is void and is supposed to 
print inorder traversal of the Tree whose nodes are given.*/
class Inordertraversal {
    static void inorder(BTreeNode root){        //theta(n)
        if(root !=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {    //T.C = O(n), A.S = O(height)
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(20);
        root.right = new BTreeNode(30);
        root.right.left = new BTreeNode(40);
        root.right.right = new BTreeNode(50);

        inorder(root);
    }
}
