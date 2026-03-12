import java.util.*;
// W/o recurrsion.
public class tribonacci{
    public static int tribo(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        else{
            int res = tribo(n-1)+tribo(n-2)+tribo(n-3);
            return res;
        }
    }
    public static void main(String[] args) {
        int res = 5;
        for(int i =0;i<res;i++){
            System.out.println("Factorial of "+i+ "=" +tribo(i));
        }
        
    }
}
