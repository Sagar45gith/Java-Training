import java.util.*;
public class snake{
    public static void main(String[] args){
        Scanner ss =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = ss.nextInt();
        int [][]a=new int[n][n];
        int num=1;

        for(int i =0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    a[i][j]=num;
                    num++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){4
                    a[i][j]=num;
                    num++;
                }
            } 
        }
        /*
        int first =0;
        int sec = 1;
        int total =n*n;
        int count=0;
        while(count<total){
            for(int i =0;i<n;i++){
                a[first][i]=num;
                num++;
                count++;
            }
            first+=2;
            if(sec>=n){
                break;
            }
            for(int i =n-1;i>=0;i--){
                a[sec][i]=num;
                num++;
                count++;
            }
            sec+=2;
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }*/

    }
}