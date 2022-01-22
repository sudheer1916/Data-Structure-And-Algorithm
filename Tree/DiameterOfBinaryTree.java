public class DiameterOfBinaryTree {     //difficult
    
    /*static int diameter(BTreeNode root){        //naive O(n^2)
        if(root == null) return 0;
        int d1 = 1+height(root.left)+height(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);

        return Math.max(d1,Math.max(d2, d3));
    }
    static int height(BTreeNode root){
        if(root == null) return 0;
        else
        return 1+Math.max(height(root.left), height(root.right));
    }*/

    static int res = 0;
    static int height(BTreeNode root){      //efficient O(n)
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res, 1+lh+rh);
        return 1+Math.max(lh, rh);          //diameter
    }
    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(10);
    	root.left=new BTreeNode(20);
    	root.right=new BTreeNode(30);
    	root.right.left=new BTreeNode(40);
    	root.right.right=new BTreeNode(60);
	    root.right.left.left=new BTreeNode(50);
	    root.right.right.right=new BTreeNode(70);

    	
    	//System.out.print(diameter(root));       //naive 

        System.out.println("height = "+height(root));       //efficient
        System.out.println("diameter = "+res);
    }
}
