import java.util.*;
public class Hamming{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int count =0;
        while(n>0){
            if((n&1)==1){ //if last bit is 1, increse the count.
                count++;
            }
            n=n>>1; //Right shift by 1

        }
        System.out.println("Hamming Weight: "+count);
    }
}