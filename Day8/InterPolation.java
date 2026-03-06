import java.util.*;
public class InterPolation{

    public static int Search(int[] arr, int target){
        int low =0;
        int high = arr.length-1;
        while(low<=high && target>=arr[low] && target<=arr[high]){
            if(low==high){
                if(arr[low]==target){
                    return low;
                }
                else{
                    return -1;
                }
            }
            int pos = low +(high-low)/((arr[high] - arr[low])) * (target - arr[low]);
            if(arr[pos]==target){
                return pos;
            }
            else if(arr[pos]<target){
                low = pos+1;
            }
            else{
                high = pos-1;
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
        System.out.println("Element "+element+ " found at index: "+result);

    }
}