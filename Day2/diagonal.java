import java.util.*;
public class diagonal{
    public static void main(String[] args){
        Scanner ss =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = ss.nextInt();
        int [][]a=new int[n][n];
        int num=1;

        //use commented logic to print the diagonal from upwards.
        for(int d =0;d<2*n-1;d++){
            //int row = d<n?0:d-n+1;
            //int col = d<n?d:n-1;
            int col = d<n?0:d-n+1;
            int row = d<n?d:n-1;
            while(row>=0 && col<n){         //col>=0 && row<n;
                a[row][col]=num++;           
                row--;                      //row++;
                col++;                      //col--;
            }
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}