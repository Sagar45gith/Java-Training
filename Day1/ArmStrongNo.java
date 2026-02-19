import java.util.*;
public class ArmStrongNo{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int count = 0;
        int og = n;
        int sum =0;
        while(n>0){
            n=n/10;
            count++;
        }
        n = og;
        while(n>0){
            int d=n%10;
            sum+= Math.pow(d,count);
            n=n/10;
        }
        if(sum==og){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not an Armstrong");
        }
        
    }
}