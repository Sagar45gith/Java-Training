//josephus problem
import java.util.*;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}

public class sll2{
    Node1 head = null;
    public void circularLL(int n){
        if(n<=0) return;
        head = new Node1(1);
        Node1 temp = head;
        for(int i =2;i<=n;i++){
            temp.next=new Node1(i);
            temp=temp.next;
        }
        temp.next=head;
    }

    public void display(int n){
        int count =0;
        Node1 temp = head;
        while(count<n && temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
            count++;
        }
        System.out.println("Back to head");
    }

    public int josephus(int k){
        if(head==null || head.next==null){
            return -1;
        }
        Node1 prev = null;
        Node1 curr = head;
        while(curr.next!=curr){
            for(int i=1;i<k;i++){
                prev=curr;
                curr=curr.next;
            }
            System.out.println("Eliminated: "+curr.data);
            prev.next=curr.next;
            curr = prev.next;
        }
        head=curr;
        return curr.data;
    }

    public static void main(String[] args){
        sll2 list = new sll2();
        list.circularLL(7);
        list.display(7);
        int res = list.josephus(2);
        System.out.println("Surviver: "+res);
    }
}