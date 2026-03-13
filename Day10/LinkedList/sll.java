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
        Node forward = null;
        while(curr!=null){
            forward = curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        head = prev;
    }
    public boolean hasCycle(Node head) {
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next;
            if(fast!=null){
                fast=fast.next;
            }
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public void swapNodes(int x, int y){
        //case 1
        if(x==y){
            System.out.println("Both nodes are equal no need to swap");
            return;
        }
        //to Search X
        Node prevX = null;
        Node currX = head;
        while(currX!=null && currX.data!=x){
            prevX = currX;
            currX = currX.next;
        }
        //to search Y
        Node prevY = null;
        Node currY = head;
        while(currY!=null && currY.data!=y){
            prevY = currY;
            currY = currY.next;
        }
        //case 2
        if(currX==null || currY==null){
            System.out.println("One or both nodes are not found");
            return ;
        }

        if(prevX!=null){
            prevX.next=currY;
        }
        else{
            head = currY;
        }

        if(prevY!=null){
            prevY.next=currX;
        }
        else{
            head = currX;
        } 

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    public int findMid(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public void splitList(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head1 = head; // First half starts from the original head
        Node head2 = slow.next; // Second half starts from the node after the middle
        if(slow != null) {
            slow.next = null; // Terminate the first half
        }
        // Now head1 and head2 are the heads of the two split lists
        System.out.println("First Split List:");
        sll list1 = new sll();
        list1.head = head1;
        list1.display();

        System.out.println("Second Split List:");
        sll list2 = new sll();
        list2.head = head2;
        list2.display();

        //Another way to display
        // System.out.println("Second Split List:");
        // temp = head2;   
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
        // System.out.println();

    }

    public void deleteFirst(){
        if(head==null){
           System.out.println("Empty list");
        }
        Node temp = head;
        head = head.next;
        temp.next=null;
    }

    public void deleteEnd(){
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    /*public void deleteAt(int k){
        if(k<=0){
            System.out.println("Invalid Position");
        }
        if(k==1){
            deleteFirst();
            return ;
        }
        Node temp = head;
        Node curr = head;
        int cnt = 1;
        while(cnt<k && temp.next!=null){
            curr=temp;
            temp=temp.next;
            cnt++;
        }
        if(cnt==k){
            curr.next=temp.next;
            temp.next=null;
        }
        else{
            System.out.println("Index out of bound");
        }
    }*/
    
    public void deleteAtpos(int pos){
        if(head==null){
            System.out.println("Empty list");
            return ;
        }
        if(pos<=0){
            System.out.println("Invalid pos");
        }
        if(pos==1){
            deleteFirst();
            return ;
        }
        Node temp = head;
        for(int i =1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
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
        System.out.println("Reversed LL:");
        list.reverse();
        list.display();
        //manually create a cycle for testing
        list.head.next.next.next.next.next.next.next = list.head; // creating a cycle (50->40->30->70->20->10->60->50)
        System.out.println("Has Cycle: " + list.hasCycle(list.head));
        
        // break the cycle for swapNodes to work properly without infinite looping
        list.head.next.next.next.next.next.next.next = null;

        list.swapNodes(30,10);
        System.out.println("After Swapping: ");
        list.display();
        System.out.println("Middle Element: " + list.findMid());

        //list.splitList();

        list.deleteFirst();
        list.deleteEnd();
        list.display();
        list.deleteAtpos(2);
        list.display();
    }
}