public class SearchInBST {
    /*static boolean search(Node root,int x){     //recursive O(h) A.s=O(h)
        if(root == null)
        return false;
        if(root.key == x)
        return true;
        else if(root.key > x)
        return search(root.left, x);
        else
        return search(root.right, x);
    }*/
    static boolean search(Node root,int x){
        while (root != null) {
            if(root.key == x)
            return true;
            else if(root.key<x)
            root = root.right;
            else
            root = root.left;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root=new Node(15);
    	root.left=new Node(5);
    	root.left.left=new Node(3);
    	root.right=new Node(20);
    	root.right.left=new Node(18);
    	root.right.left.left=new Node(16);
    	root.right.right=new Node(80);
    	int x=16;
    	
    	if(search(root,x))
    	    System.out.print("Found");
    	else
    	    System.out.print("Not Found");
    }
}
