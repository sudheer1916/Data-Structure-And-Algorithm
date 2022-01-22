//note:- we can construct the BT only when inorder and other traversal is given
//other traversal means preorder or postorder
//This code discusses the Construction of a Binary Tree from Inorder and Preorder traversal.
//by hashing , we can do it in O(n) time
class ConstructBinaryTree {         //O(n^2)    DIfficult
    static int preIndex = 0;
    static BTreeNode ctree(int in[],int pre[],int is,int ie){
        if(is>ie) return null;
        BTreeNode root = new BTreeNode(pre[preIndex++]);

        int inIndex = is;
        for (int i = is; i < ie; i++) {
            if(in[i] == root.key){
                inIndex = i;
                break;
            }
        }
        root.left = ctree(in, pre, is, inIndex-1);
        root.right = ctree(in, pre, inIndex+1, ie);
        return root;
    }
    static void inorder(BTreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        int in[]={20,10,40,30,50};
    	int pre[]={10,20,30,40,50};
    	int n= in.length;
    	BTreeNode root=ctree(in, pre, 0, n-1);
    	
    	inorder(root);
    }
}
