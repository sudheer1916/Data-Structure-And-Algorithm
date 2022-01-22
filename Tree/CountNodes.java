public class CountNodes {       
    /*static int countNode(BTreeNode root){       //naive theta(n) 
        if(root == null)
        return 0;
        else
        return 1+countNode(root.left)+countNode(root.right);
    }*/
    static double countNode(BTreeNode root){        //efficient O(logn*logn)
        int lh=0,rh=0;
        BTreeNode curr = root;
        while (curr != null) {
            lh++;
            curr = curr.left;
        }
        curr = root;
        while (curr != null) {
            rh++;
            curr = curr.right;
        }
        if(lh==rh)
        return Math.pow(2,lh) - 1;

        return 1+countNode(root.left)+countNode(root.right);
    }
    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(10);
    	root.left=new BTreeNode(20);
    	root.right=new BTreeNode(30);
    	root.right.left=new BTreeNode(40);
    	root.right.right=new BTreeNode(50);
    	
    	System.out.print(countNode(root));
    }
}
