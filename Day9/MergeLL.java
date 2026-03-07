import java.util.*;
public class MergeLL{
    public static void  main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));  //to insert all the elements at one time, .aslist(add al the elements to the list)
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(6,7,8,9,10));
        System.out.println("Linked list 1: "+list1);
        System.out.println("Linked list 2: "+list2);
        
        //merge l1 and l2;
        list1.addAll(list2);

        System.out.println("Merged list: "+list1);
    }
}