import java.util.*;
public class JumpSearch{

    public static int Search(int[] arr, int target){
        int n = arr.length;
        int jump = (int)Math.sqrt(n);
        int prev =0;
        while(prev<n && arr[Math.min(jump,n)-1]<target){
            prev = jump;
            jump+=(int)Math.sqrt(n);
            if(prev>=n){
                return -1;
            }
        }

        //linear Search
        for(int i =prev;i<Math.min(jump,n);i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to be searched: ");
        int element = sc.nextInt();

        int res = Search(arr,element);

        if(res!=-1){
            System.out.println("Element "+element+ " found at index : "+res);
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}