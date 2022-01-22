//if we go to the left child then we change the upper value of range
//if we go to the right child then we change the lower value of range
public class CheckForBST1 {
    static boolean isBST(Node root,int min,int max){
        if(root == null)        //correct and efficient
        return true;

        return (root.key>min && root.key<max &&
                isBST(root.left, min, root.key) && isBST(root.right, root.key, max));
    }
    public static void main(String[] args) {
        Node root = new Node(4);  
        root.left = new Node(2);  
        root.right = new Node(5);  
        root.left.left = new Node(1);  
        root.left.right = new Node(3);

        if(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
        System.out.println("IS BST");
        else
        System.out.println("Not a BST");
    }
}
