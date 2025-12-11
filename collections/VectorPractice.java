// new Vector(0, 0) // Initial, Increment
// Initial 0 => vector.capacity = 0
// Increment 0 => vector grow = prevCapacity * 2, 
// If Increment > 0 => vector grow = increment


// vector.enumerate = Legacy enumeration
// vector.firstElement
// vector.lastElement
// vector.indexOf(element, int start) => from "start" till last index
// vector.lastIndexOf(element, int end) => 0 index till "end"
// vector.removeElementAt(int index)
// vector.removeElement(Object element)

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("test");
        v.add("best");
        v.add("rest");
        v.add("zest");
        v.add("pest");

        String[] str = new String[4]; // ArrayIndexOutOfBoundException as str.length < v.size()
        v.copyInto(str);

        System.out.println(str);
    }
}