import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//method1 using line by line traversal
class SpiralTreeTraversal {
    static void printSpiral(BTreeNode root){    //method1 O(n)
        if(root == null) return ;

        Queue<BTreeNode> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false;
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                BTreeNode curr = q.poll();
                if(reverse)
                    s.add(curr.key);
                else
                    System.out.print(curr.key+" ");
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            if(reverse){
                while (!s.isEmpty()) {
                    System.out.print(s.pop()+" ");
                }
            }
            reverse = !reverse;
            //System.out.println();
        }
    }

    /*static void printSpiral(BTreeNode root){        //method2 O(n)
        if(root == null) return ;
        Stack<BTreeNode> s1 = new Stack<>();
        Stack<BTreeNode> s2 = new Stack<>();

        s1.add(root);
        while (!s1.isEmpty() || s2.isEmpty()) {
            while (!s1.empty()) {
                BTreeNode temp = s1.peek();
                s1.pop();
                System.out.print(temp.key+" ");
                if(temp.right != null)          //right,left
                s2.add(temp.right);
                if(temp.left != null)
                s2.add(temp.left);
            }
            while (!s2.empty()) {
                BTreeNode temp = s2.pop();
                System.out.print(temp.key+" ");
                if(temp.left!=null)             //reverse = left,right
                s1.add(temp.left);
                if(temp.right!=null)
                s1.add(temp.right);
            }
        }
    }*/

    public static void main(String[] args) {
        BTreeNode root=new BTreeNode(1);
    	root.left=new BTreeNode(2);
    	root.right=new BTreeNode(3);
    	root.left.left=new BTreeNode(4);
    	root.left.right=new BTreeNode(5);
    	root.right.left=new BTreeNode(6);
    	root.right.right=new BTreeNode(7);
    	
        printSpiral(root);
    }
}
