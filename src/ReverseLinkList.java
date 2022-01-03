public class ReverseLinkList {
    static Node head;
    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next ;
        while (current!= null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printlist(Node node){
        while (node != null){
            System.out.println(node.key + "");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        ReverseLinkList lll = new ReverseLinkList();
        lll.head = new Node(20);
        lll.head.next = new Node(50);
        lll.head.next.next = new Node(70);
        lll.printlist(head);
        System.out.println("Reversed");
        lll.reverse(head);
        lll.printlist(head);

    }
}
