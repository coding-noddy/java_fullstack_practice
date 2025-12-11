import java.util.*;

public class EvenIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(25);
        list.add(21);
        list.add(25);
        list.add(27);
        list.add(29);
        list.add(30);

        System.out.println(list);

        for (int i = 0; i < list.size();) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                continue;
            }
            i++;
        }

        // for(int i = list.size() - 1; i >=0; i--) {
        // if (list.get(i) % 2 == 0) {
        // list.remove(i);
        // }
        // }

        // ListIterator<Integer> listIteratorEnd = list.listIterator(list.size());
        // while(listIteratorEnd.hasPrevious()) {
        // if(listIteratorEnd.previous() % 2 == 0) {
        // listIteratorEnd.remove();
        // }
        // }

        // ListIterator<Integer> listIteratorStart = list.listIterator();
        // while (listIteratorStart.hasNext()) {
        //     if (listIteratorStart.next() % 2 == 0) {
        //         listIteratorStart.remove();
        //     }
        // }

        System.out.println(list);
    }
}