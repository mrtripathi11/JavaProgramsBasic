public class Symmetric {
    public static boolean isSymmetric(Node x,Node y){
        if(x==null && y==null){
            return true;
        }
        return (x!=null && y!=null) && isSymmetric(x.left,y.right) && isSymmetric(x.right,y.left);
    }
    public static boolean isSymmetric(Node root){
        return isSymmetric(root.left ,root.right );
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        //root.right.left = new Node(5);

        if (isSymmetric(root)) {
            System.out.print("The binary tree is symmetric");
        }
        else {
            System.out.print("The binary tree is not symmetric");
        }
    }
}
