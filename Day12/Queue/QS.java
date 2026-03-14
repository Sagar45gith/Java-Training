//implemenation of stack using queue
import java.util.*;
class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    
    public void push(int x) {
        q1.offer(x);
        for(int i =0;i<q1.size()-1;i++){
            q1.offer(q1.poll());
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

public class QS{
    public static void main(String[] args){
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element: "+s.top());
        System.out.println("Remove: "+s.pop());
        System.out.println("Top element: "+s.top());
        System.out.println("IsEmpty: "+s.empty());
    }
}