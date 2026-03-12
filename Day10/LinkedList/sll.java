class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class sll{
    Node head = null;
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addMid(int data,int pos){
        int cnt =0;
        if(pos==1){
            addFirst(data);
            return;
        }
        Node temp = head;
        while(cnt<pos-1){
            temp=temp.next;
            cnt++;
        }   
        if(temp.next==null){
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next=newNode;
    }

    public void count(){
        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        System.out.println("COUNT IS: "+cnt);
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node forward = curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }

    public void display(){
        Node temp=head;  
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        sll list = new sll();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addFirst(60);
        list.addMid(70,3);
        list.display();
        list.count();
    }
}