class CheckForBST {
    static int maxValue(Node root){
        if(root == null)
        return Integer.MIN_VALUE;
        int res = root.key;
        int lmax = maxValue(root.left);
        int rmax = maxValue(root.right);
        if(lmax>res)
        res = lmax;
        if(rmax > res)
        res = rmax;
        return res;
    }
    static int minValue(Node root){
        if(root == null)
        return Integer.MAX_VALUE;
        int res = root.key;
        int lres = minValue(root.left);
        int rres = minValue(root.right);
        if(lres < res)
        res = lres;
        if(rres < res)
        res = rres;
        return res;
    }
    static int isBST(Node root){    //method 1 -> correct but inefficient
        if(root == null)            //O(n^2)
        return 1;
        if(root.left!=null && maxValue(root.left) > root.key)
        return 0;
        if(root.right!=null && minValue(root.right) < root.key)
        return 0;
        if(isBST(root.left) == 0 || isBST(root.right)==0)
        return 0;

        return 1;
    }
    public static void main(String[] args) {
        Node root = new Node(4);  
        root.left = new Node(2);  
        root.right = new Node(5);  
        root.left.left = new Node(1);  
        root.left.right = new Node(3);  
          
        if (isBST(root)==1) 
            System.out.println("IS BST"); 
        else
            System.out.println("Not a BST");
    }
}
