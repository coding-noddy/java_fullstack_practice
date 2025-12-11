import java.util.ListIterator;
import java.util.*;

public class LinkedListSwap {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);
        swapNumbers(list);
        System.out.println(list);
    }

    public static void swapNumbers(LinkedList<Integer> list) {
        for(int i = 0; i + 1 < list.size(); i+=2) {
            Integer t = list.get(i);
            list.remove(i);
            list.add(i + 1, t);
        }
    }
}