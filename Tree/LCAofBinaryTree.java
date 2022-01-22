import java.util.ArrayList;

//LCA (Lowest Common Ancestor) problem
//we can also find distance b/w two nodes
//naive -> three traversals and require O(n) extra space
/**
 * Efficient solution idea:- we do normal recursion ,we have the 
 * following cases for each node
 * The solution does only one traversal of binary tree, 
 * but assumes that both keys exist in the binary tree.
 * 1) if it is same as n1 and n1
 * 2) if one of its subtrees contains n1 and other contains n2
 * 3) if one of its subtrees contains both n1 and n2
 * 4) if none of the subtrees contains any of n1 and n2
 */
class LCAofBinaryTree {         //Difficult     naive theta(n)
    static boolean findPath(BTreeNode root,ArrayList<BTreeNode> p,int n){
        if(root == null) return false;
        p.add(root);
        if(root.key == n) return true;
        if(findPath(root.left, p, n)||findPath(root.right, p, n))
        return true;
        p.remove(p.size()-1);
        return false;
    }

    /*static BTreeNode lca(BTreeNode root,int n1,int n2){
        ArrayList<BTreeNode> path1 = new ArrayList<>();
        ArrayList<BTreeNode> path2 = new ArrayList<>();
        if(findPath(root,path1,n1)==false || findPath(root, path2, n2)==false)
        return null;
        for(int i=0;i<path1.size()-1 && i<path2.size()-1;i++){
            if(path1.get(i+1)!=path2.get(i+1))
            return path1.get(i);
        }
        return null;
    }*/
    static BTreeNode lca(BTreeNode root,int n1,int n2){
        if(root==null) return null;         //efficient theta(n)
        if(root.key==n1 || root.key==n2)
        return root;
        
        BTreeNode lca1 = lca(root.left, n1, n2);
        BTreeNode lca2 = lca(root.right, n1, n2);

        if(lca1!=null && lca2 != null)
        return root;
        if(lca1!=null)
            return lca1;
        else
            return lca2;
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
