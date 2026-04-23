package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    static void main() {
        ArrayList < Integer> arrayList = new ArrayList<>();
        LinkedList < Integer> linkedList = new LinkedList<>();

        int size = 1000000;

        for (int i  = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.nanoTime();
        arrayList.add(size / 2, 999);
        long end = System.nanoTime();
        System.out.println("Time array list " + ((end -start)));

        start = System.nanoTime();
        linkedList.add(size/2, 999);
        end = System.nanoTime();
        System.out.println("Time linked list " + ((end -start)));
    }
}
