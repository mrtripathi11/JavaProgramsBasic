class Node{
    int key;
    Node left = null ,right = null;
    Node next;
    Node prev;
    Node(int key){
        this.key = key;
    }
}
public class Identical {
    public static boolean isIdentical(Node x,Node y){
        if(x== null && y == null){
            return true;
        }
        else{
            return (x!=null && y!=null) && (x.key ==y.key)&& isIdentical(x.left,y.left)&&isIdentical(x.right,y.right);
        }
    }

    public static void main(String[] args) {
        Node x = new Node(15);
        x.left = new Node(4);
        x.right = new Node(19);

        Node y = new Node(15);
        y.left = new Node(4);
        y.right = new Node(18);
        if (isIdentical(x,y)){
            System.out.println("Identical");
        }
        else
            System.out.println("Not valid");
    }
}
