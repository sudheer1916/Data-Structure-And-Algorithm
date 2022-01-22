import java.util.LinkedList;
import java.util.Queue;

//Maximum Width of Binary tree is the maximum number of nodes present in a level of the Tree.
//Hint:- we use level order traversal line by line logic to find maximum width of the Binary Tree.

class MaxWidthOfBinaryTree {
    static int maxWidth(BTreeNode root){    //thet(n)    a.s = O(W)
        if(root ==  null) return 0;
        Queue<BTreeNode> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        while (!q.isEmpty()) {
            int count = q.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                BTreeNode curr = q.poll();
                //System.out.print(curr.key+" ");
                if(curr.left != null)
                q.add(curr.left);
                if(curr.right != null)
                q.add(curr.right);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(10);
    	root.left=new BTreeNode(20);
    	root.right=new BTreeNode(30);
    	root.left.left=new BTreeNode(40);
    	root.left.right=new BTreeNode(50);
        root.right.left = new BTreeNode(60);

        System.out.println(maxWidth(root));
    }
}
