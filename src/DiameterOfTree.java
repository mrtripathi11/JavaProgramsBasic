import java.util.concurrent.atomic.AtomicInteger;

public class DiameterOfTree {
    public static int getDiameter(Node root , AtomicInteger diameter){
        if (root ==null ){
            return 0;
        }
        int leftht  = getDiameter(root.left ,diameter);
        int rightht = getDiameter(root.right,diameter);
        int max_diameter = leftht+rightht+1;
        diameter.set(Math.max(diameter.get(),max_diameter));
        return Math.max(leftht,rightht)+1;
    }
    public static int getDiameter(Node root)
    {
        AtomicInteger diameter = new AtomicInteger(0);
        getDiameter(root, diameter);

        return diameter.get();
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        System.out.print("The diameter of the tree is " + getDiameter(root));
    }
}
