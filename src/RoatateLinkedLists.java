
public class RoatateLinkedLists {
    Node head;
     void rotate(int k ){
        if(k==0){
            return ;
        }
        Node current  = head;
        int count = 1;
        while(count <k && current != null){
            current = current.next;
            count++;
        }
        if(current == null){
            return;
        }
        while (current.next != null)
            current= current.next;
        Node kn = head;
        head = kn.next;
        kn.next = null;
    }
    void push (int newdata){
        Node new_data = new Node(newdata);
        new_data.next = head;
        head = new_data;
    }
    void printlist(){
        Node temp = head;
        while(temp!= null) {
            System.out.println(temp.key + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RoatateLinkedLists list = new RoatateLinkedLists();
        for (int i = 60; i>=10; i-=10) {
            list.push(i);
        }
        System.out.println("Print List");
        list.printlist();
        System.out.println("Roatated list");
        list.rotate(4);
        System.out.println("List after successful roatation");
        list.printlist();
    }
}
