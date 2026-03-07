import java .util.*;
public class ALinsertion {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();   //or ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Before Insertion: " + list);

        // Inserting an element at a specific index
        list.add(1, 15); // This will insert 15 at index 1
        System.out.println("After Insertion: " + list);
    }
}