public class FixBSTWithNodesSwapped {
    static Node prev = null,first = null,second = null;
    static void fixBST(Node root){
        if(root == null)
        return ;
        fixBST(root.left);          //efficient O(n)
        if(prev != null && root.key<prev.key){
            if(first == null)
            first = prev;

            second = root;
        }
        prev = root;
        fixBST(root.right);
    }
    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(18);  
        root.left = new Node(60);  
        root.right = new Node(70);  
        root.left.left = new Node(4);  
        root.right.left = new Node(8);
        root.right.right = new Node(80);

        inorder(root);
        System.out.println();
        fixBST(root);
        //swapping
        int temp = first.key;
        first.key = second.key;
        second.key = temp;
        inorder(root);
    }
}
