//this is also solution for farthest node from the given leaf
class BurnBTfromALeaf {
    static int res=0;
    static int burnTime(BTreeNode root,int leaf,Distance dist){
        if(root == null) return 0;
        if(root.key == leaf){
            dist.val = 0;
            return 1;   
        }
        Distance ldist = new Distance(-1);
        Distance rdist = new Distance(-1);
        int lh = burnTime(root.left, leaf, ldist);
        int rh = burnTime(root.right, leaf, rdist);

        if(ldist.val != -1){
            dist.val = ldist.val+1;
            res = Math.max(res, dist.val+rh);
        }
        else if(rdist.val != -1){
            dist.val = rdist.val+1;
            res = Math.max(res, dist.val+lh);
        }
        return Math.max(lh, rh)+1;
    }
}
class Distance{
    int val;
    Distance(int d){
        val = d;
    }
}
class BurnMain{
    public static void main(String[] args) {
        //BurnBTfromALeaf obj = new BurnBTfromALeaf();
        BTreeNode root=new BTreeNode(10);
    	root.left=new BTreeNode(20);
    	root.right=new BTreeNode(30);
    	root.left.left=new BTreeNode(40);
    	root.left.right=new BTreeNode(50);
    	root.left.left.left=new BTreeNode(60);
	    root.left.left.left.left=new BTreeNode(70);
        Distance dist = new Distance(-1);
        int leaf = 50;
        BurnBTfromALeaf.burnTime(root,leaf,dist);
        System.out.println(BurnBTfromALeaf.res);
    }
}
