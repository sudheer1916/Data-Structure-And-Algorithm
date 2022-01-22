import java.util.LinkedList;
import java.util.Queue;

//In Level Order Traversal Line by Line, 
//we print the nodes at each level separately in a new line.
//In method-1, we implement this function using a single loop.
//In method-2, we implement this function using nested loops.
class LevelOrderLineByLine {
    /*static void printlevel(BTreeNode root){ //method1 O(n+h)(h is for null)
        if(root == null) return ;
        Queue<BTreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (q.size() > 1) {
            BTreeNode curr = q.poll();
            if(curr == null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);

        }
        }*/
    
        static void printlevel(BTreeNode root){     //method2 O(n)
        if(root == null) return ;
        Queue<BTreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                BTreeNode curr = q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null) 
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
            System.out.println();
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
