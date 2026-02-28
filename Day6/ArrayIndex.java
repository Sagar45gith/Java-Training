import java.util.Scanner;
public class ArrayIndex{

    static void fetchElement(int[] arr, int index) throws ArrayIndexOutOfBoundsException{
        if(index<0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("Array Index Out Of Bounds");
        }
        else{
            System.out.println(arr[index]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter Index to be Searched:");
        int index =sc.nextInt();
        try{
            fetchElement(arr,index);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught Exception: "+e.getMessage());
        }
        finally{
            System.out.println("Finally Block Exceuted");
        }
    }
}