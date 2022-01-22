//import java.util.LinkedList;
//import java.util.Queue;

public class LeftViewOfBinaryTree {
    /*static void printLeft(BTreeNode root){      //iterative theta(n) A.s = theta(w)
        if(root == null) return ;
        Queue<BTreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                BTreeNode curr = q.poll();
                if(i == 0)
                System.out.print(curr.key+" ");
                if(curr.left != null)
                q.add(curr.left);
                if(curr.right != null)
                q.add(curr.right);
            }
        }
    }*/

    static void printLeft(BTreeNode root){      //recusive O(n) A.s theta(h)
        printLeftView(root,1);
    }
    static int maxLevel = 0;
    static void printLeftView(BTreeNode root,int level){
        if(root == null)
        return ;
        if(maxLevel<level){
            System.out.print(root.key+" ");
            maxLevel = level;
        }
        printLeftView(root.left, level+1);
        printLeftView(root.right, level+1);
    }

    public static void main(String[] args) {
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(20);
        root.right = new BTreeNode(30);
        root.right.left = new BTreeNode(40);
        root.right.right = new BTreeNode(50);

        printLeft(root);
    }
}
