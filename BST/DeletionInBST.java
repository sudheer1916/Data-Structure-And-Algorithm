/*
how to delete a node from a Binary Search There are three posibilities:
1.Node to be deleted is a leaf node.
2.Node to be deleted has only one child.
3.Node to be deleted has two children.
inorder successor is the closest higher value and 
inorder predecessor is the closest lower value.
Note: inorder of BST is always sorted.
 */
public class DeletionInBST {
    static Node getSucc(Node root){
        //this suss code only works when right side of node not null
        Node curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
    static Node delNode(Node root,int x){       //O(h)  A.s = O(h)
        if(root == null)
        return null;
        if(root.key < x)
        root.right = delNode(root.right, x);
        else if(root.key > x)
        root.left = delNode(root.left, x);
        else{       //root.key == x
            
            if(root.left == null)
            return root.right;
            else if(root.right == null)
            return root.left;
            else{
                Node succ = getSucc(root);
                root.key = succ.key;
                root.right = delNode(root.right, succ.key);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(15);
    	root.right.left=new Node(12);
    	root.right.right=new Node(18);
    	int x=15;
    	
    	root=delNode(root,x);
	    Node.inorder(root);
    }
}
