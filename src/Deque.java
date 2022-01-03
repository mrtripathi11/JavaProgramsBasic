import java.util.LinkedList;
import java.util.*;
public class Deque {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<String>();
        dq.add("Element 1");
        dq.addFirst("Element 2");
        dq.addLast("Elemnt 3");
        System.out.println(dq);
        System.out.println(dq.descendingIterator());
        System.out.println(dq.removeFirst());
        System.out.println(dq.pop());
        System.out.println(dq);
    }
}
