public class DLL {
    Node head;
    Node prev;
    public void push(int new_Data){
        Node newdata = new Node(new_Data);
        newdata.next = head;
        newdata.prev = null;
        if(head!= null){
            head.prev = newdata;
        }
        head = newdata;
    }
    public void del(Node del){
        if(head == null || del == null){
            return;
        }
        if(head==del)
            head = del.next;
        if(del.next!=null){
            del.next.prev = del.prev;
        }
        if(del.prev!=null){
            del.prev.next = del.next;
        }
    }
    void printlist( Node node){
        Node last =null;
        while (node!=null){
            System.out.println(last.key +" ");
            last = node;
            node = node.next;

        }
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.push(2);
        dll.push(4);
        dll.push(6);
        dll.push(7);
        System.out.println("DOubly Linked List");
        dll.printlist(dll.head);
        System.out.println("Deleted list");
        dll.del(dll.head);
    }
}
