import java.util.concurrent.atomic.AtomicInteger;

public class CountSubtrees {
    public static int countSubtrees(Node root, AtomicInteger count){
        if(root == null)
            return Integer.MIN_VALUE;
        if(root.left == null && root.right == null) {
            count.incrementAndGet();
            return root.key;
        }
        int left = countSubtrees(root.left,count);
        int right = countSubtrees(root.right,count);
        if((left == Integer.MIN_VALUE && right == root.key) ||
                (right == Integer.MIN_VALUE && left == root.key) ||
                (left == right && left == root.key)) {
            count.incrementAndGet();

            return root.key;
        }
        return Integer.MAX_VALUE;
    }
    public static int countSubtrees(Node root){
        AtomicInteger count = new AtomicInteger(0);
        countSubtrees(root,count);
        return count.get();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(4);
        root.right.left.left = new Node(5);
        root.right.left.right = new Node(5);
        root.right.right.right = new Node(7);

        System.out.print(countSubtrees(root));
    }
}
