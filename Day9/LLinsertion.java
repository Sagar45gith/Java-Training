import java.util.*;
public class LLinsertion {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.addLast(20);
        list.addFirst(30);
        System.out.println("Before Insertion: " + list);

        // Inserting an element at a specific index
        list.add(1, 15); // This will insert 15 at index 1
        System.out.println("After Insertion: " + list);
    }
}