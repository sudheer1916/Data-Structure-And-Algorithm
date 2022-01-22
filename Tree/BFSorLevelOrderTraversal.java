import java.util.LinkedList;
import java.util.Queue;

/**
 * we will discuss about a function that takes root as a parameter, 
 * doesn’t returns anything and prints the level order traversal in a single line.
 * we implement this function using queue datastructure.
 */
class BFSorLevelOrderTraversal {        //theta(n) ,a.s = theta(w), w=width of binary tree
    static void printlevel(BTreeNode root){
        if(root == null) return ;
        Queue<BTreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BTreeNode curr = q.poll();
            System.out.print(curr.key+" ");
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right != null) 
                q.add(curr.right);
        }
    }
    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(10);
    	root.left=new BTreeNode(20);
    	root.right=new BTreeNode(30);
    	root.left.left=new BTreeNode(40);
    	root.left.right=new BTreeNode(50);
        root.right.left = new BTreeNode(60);
    	root.right.right=new BTreeNode(70);

        printlevel(root);
    }
}
