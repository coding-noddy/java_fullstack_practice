package utility;

import java.util.*;

public class CommandLineUtility {
    public List<Integer> acceptIntegerList() {
        Scanner s = new Scanner(System.in);
        System.out.println("Number of elements in the list: ");
        int n = s.nextInt();

        System.out.println("Enter elements: ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        return list;
    }
}