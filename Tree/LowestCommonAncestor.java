import java.util.ArrayList;

//we can also find the distance b/w given nodes by LCA method
class LowestCommonAncestor {
    static boolean findPath(BTreeNode root,ArrayList<BTreeNode> p,int n){
        if(root == null) return false;
        p.add(root);
        if(root.key == n) return true;

        if(findPath(root.left, p, n) || findPath(root.right, p, n))
        return true;
        p.remove(p.size()-1);
        return false;
    }
    static BTreeNode lca(BTreeNode root,int n1,int n2){     //naive O(n)
        ArrayList <BTreeNode> path1 = new ArrayList<>();
        ArrayList <BTreeNode> path2 = new ArrayList<>();
        if(findPath(root,path1,n1)==false || findPath(root,path2,n2))
        return null;
        for (int i=0; i<path1.size()-1 && i<path2.size()-1; i++) {
            if(path1.get(i+1)!=path2.get(i+1))
            return path1.get(i);
        }
        return null;
    }
    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(10);
    	root.left=new BTreeNode(20);
    	root.right=new BTreeNode(30);
    	root.right.left=new BTreeNode(40);
    	root.right.right=new BTreeNode(50);
    	int n1=20,n2=50;
	
	    BTreeNode ans=lca(root,n1,n2);
    	System.out.println("LCA: "+ans.key);
    }
}
