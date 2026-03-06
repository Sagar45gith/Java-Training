import java.util.*;
public class sqrt {
    public static int mySqrt(int x) {
        int st = 1;
        int end = x/2;
        if(x == 0 || x==1){
            return x;
        }
        while(st<=end){
            int mid = st+(end-st)/2;
            if((long)mid*mid==x){
                return mid;
            }
            if((long)mid*mid>x){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args){
        System.out.println("Enter the element:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = mySqrt(x);
        System.out.println("Square root: "+res);
    }
}