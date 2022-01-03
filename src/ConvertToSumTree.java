
public class ConvertToSumTree {
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.key+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static int convertSum(Node root){
        if(root == null){
            return 0;
        }
        int left = convertSum(root.left);
        int right = convertSum(root.right);
        int old  = root.key;
        root.key = left+right;
        return root.key + old;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        convertSum(root);
        preorder(root);
    }
}
