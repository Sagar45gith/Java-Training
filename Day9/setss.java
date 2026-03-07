//use hashset, linkedhashset, treeset;
import java.util.*;
public class setss{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,20,32,4,59));
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(10,22,3,40,5));
        System.out.println("HashSet (Unordered): "+set);
        System.out.println("LinkedHashSet (Ordered): "+linkedHashSet);
        System.out.println("TreeSet (Sorted): "+treeSet);
    }
}