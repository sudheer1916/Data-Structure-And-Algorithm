

//Inorder conversion of Binary Tree to Doubly Linked List inplace.
/**
 *Hint:- we need to do the inorder traversal of the Tree and while doing 
 inorder traversal we can simply maintain a previous pointer or reference 
 of the previously traversed node. And change right child of the previous
 node to current node and left child of current node as previous.
 */
class ConvertBinaryTreetoDoublyLL {
    static BTreeNode prev = null;
    static BTreeNode BTToDLL(BTreeNode root){   //Difficult
        if(root == null) return root;           //O(n)  a.s = O(h)

        BTreeNode head = BTToDLL(root.left);
        if(prev == null)
        head = root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTToDLL(root.right);
        return head;
    }

    static void printlist(BTreeNode head){
        BTreeNode curr=head;
        while(curr!=null){
            System.out.print(curr.key+" ");
            curr=curr.right;
        }
    }
    
    public static void main(String[] args) {
        
        BTreeNode root=new BTreeNode(10);
    	root.left=new BTreeNode(5);
    	root.right=new BTreeNode(20);
    	root.right.left=new BTreeNode(30);
        root.right.right=new BTreeNode(35);
    	
        BTreeNode head=BTToDLL(root);
	    printlist(head);
    }
}
