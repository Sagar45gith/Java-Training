import java.util.*;
public class zigzagPattern{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        
        /*for(int i =1;i<=3;i++){
            for(int j =1;j<=n;j++){
                if(i==1 && j%4==3){
                    System.out.print("*");
                }
                else if(i==2 && j%2==0){
                    System.out.print("*");
                }
                else if(i==3 && j%4==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        /*for(int i =1;i<=3;i++){  //i = rows (fixed 3)
            for(int j =1;j<=n;j++){ //j = columns
                if((i==1 && j%4==3) || (i==2 && j%2==0)|| (i==3 && j%4==1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        for(int i =1;i<=3;i++){  //i = rows (fixed 3)
            for(int j =1;j<=n;j++){ //j = columns
                if((i==3 && j%4==3) || (i==2 && j%2==0)|| (i==1 && j%4==1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}