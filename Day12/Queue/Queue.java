import java.util.*;
public class Queue{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Queue: "+q);
        System.out.println("Remove: "+q.poll());
        System.out.println("Queue: "+q);
        System.out.println("Front element: "+q.peek());
    }
}