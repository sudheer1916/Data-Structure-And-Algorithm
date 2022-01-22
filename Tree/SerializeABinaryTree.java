import java.util.ArrayList;
//consstructed using preorder traversal 
class SerializeABinaryTree {
    static final int empty = -1;
    static void serialize(BTreeNode root,ArrayList<Integer> arr){
        if(root == null){           //theta(n)
            arr.add(empty);
            return ;
        }
        arr.add(root.key);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }
    public static void main(String[] args) {
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(20);

        ArrayList<Integer> arr = new ArrayList<>();
        serialize(root,arr);
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
}
