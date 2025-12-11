import java.util.*;

import utility.CommandLineUtility;

public class ListRetain {
    public static void main(String[] args) {
        CommandLineUtility clu = new CommandLineUtility();

        List<Integer> list = clu.acceptIntegerList();
        List<Integer> list2 = clu.acceptIntegerList();

        List<Integer> resultList = listRetain(list, list2);
        System.out.println("List 1: " + list);
        System.out.println("List 2: " + list2);
        System.out.println("Result: " + resultList);
    }

    public static List<Integer> listRetain(List<Integer> list1, List<Integer> list2) {
        LinkedList<Integer> resultList = new LinkedList<>();
        for(Integer n: list1) {
            if (list2.contains(n)) {
                resultList.add(n);
            }
        }
        return resultList;
    }
}