import java.util.LinkedList;

public class RverseingLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        System.out.println(list);
        LinkedList<Integer> llist = new LinkedList<>();
        list.descendingIterator().forEachRemaining(llist::add);
        System.out.println(llist);
    }
}
