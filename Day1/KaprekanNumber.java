import java.util.*;
public class KaprekanNumber{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int k =0;
        if(n==1){
            System.out.println("Kaprekan Number");
        }
        else{
            int a = n*n;
            int d = 10;
            while(d<a){
                int mod = a%d;
                int div = a/d;
                if(mod>0 && mod+div == n){
                    System.out.println("Kaprekan Number");
                    k=1;
                    break;
                }
                d=d*10;
            }
        }
        if(k==0){
            System.out.println("Not a Kaprekan Number");
        }
        
    }
}