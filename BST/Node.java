class Node{
    int key;
    Node right,left;
    Node(int x){
        key = x;
        //left = right = null;
    }
    static void inorder(Node root){     
        if(root != null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
}