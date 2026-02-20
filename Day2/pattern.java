import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        /*for(int i =1; i<=n;i++){         
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        /*int st = 1;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=st;k++){
                System.out.print("*");
            }
            st+=2;
            System.out.println();
        }*/

       //inverted.
       for(int i =n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println( );
       }
    }
}