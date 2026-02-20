import java.util.*;
public class ArmStrongNo{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int count = 0; //to count the number of digits
        int og = n; 
        int sum =0;
        while(n>0){
            n=n/10;  //to remove the last digit
            count++; 
        }
        n = og; //reset n to original value
        while(n>0){ //to calculate the sum of the digits raised to the power of count
            int d=n%10;  
            sum+= Math.pow(d,count); //sum = sum + (d^count)
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