import java.util.*;
public class heapp{
    public static void main(String[] args){

        //by default pq is minheap;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println("The peek element: "+pq.peek());

        //changing into maxheap;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(10);
        pq1.add(20);
        pq1.add(5);

        System.out.println("The peek element: "+pq1.peek());

    }
}