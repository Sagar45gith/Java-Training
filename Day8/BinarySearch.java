import java.util.*;
public class BinarySearch{

    public static int Search(int[] arr, int element){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==element){
                return mid;
            }
            else if(arr[mid]<element){
                low=mid+1;
            }
            else{
                high = mid-1;
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

        int result = Search(arr,element);
        if(result!=-1){
            System.out.println("Element "+element+" found at index "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}