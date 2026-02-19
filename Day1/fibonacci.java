import java.util.*;
// W/o recurrsion.
public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int f =0;
        int s =1;
        for(int i=1;i<=n;i++){
            System.out.print(f+" ");
            int sum=f+s;
            f=s;
            s=sum;
        }
    }
}
