class NodesAtKthDistance {
    static void printKDist(BTreeNode root,int k){
        if(root == null) return ;
        if(k == 0) 
        System.out.print(root.key+" ");
        else{
            printKDist(root.left, k-1);
            printKDist(root.right, k-1);
        }
    }
    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(10);
    	root.left=new BTreeNode(20);
    	root.right=new BTreeNode(30);
    	root.left.left=new BTreeNode(40);
    	root.left.right=new BTreeNode(50);
    	root.right.right=new BTreeNode(70);
    	root.right.right.right=new BTreeNode(80);
    	int k=2;
    	
        printKDist(root,k);
    }
}
