import java.util.*;
// W/o recurrsion.
public class strongNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int d = 0;
        int og=n;
        int sum =0;
        while(n>0){
            int fact=1;
            d=n%10;
            for(int i=1;i<=d;i++){
                fact*=i;
            }
            sum+=fact;
            n=n/10;
        }
        if(sum==og){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }
}
