import java.util.ArrayList;
//traverses using preorder traversal           theta(n)
public class DeserializeABinaryTree {

    static int index=0;
    static final int empty = -1;
    static BTreeNode deSerialize(ArrayList<Integer> arr){
        if(index == arr.size())
        return null;
        int val = arr.get(index);
        index++;
        if(val == empty) return null;
        BTreeNode root = new BTreeNode(val);
        root.left = deSerialize(arr);
        root.right = deSerialize(arr);
        return root;
    }
    static void inorder(BTreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(20);

        ArrayList<Integer> arr = new ArrayList<>();
        SerializeABinaryTree.serialize(root, arr);
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        BTreeNode newRoot = deSerialize(arr);
        inorder(newRoot);
    }
}
