import java.util.*;
public class spiral{
    public static void main(String[] args){
        Scanner ss =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = ss.nextInt();
        int [][]a=new int[n][n];
        int total = n*n;
        int count =0;
        int num =1;
        
        int sr=0, er=n-1, sc=0,ec=n-1;

        while(count<total){

            for(int i =sc; count<total && i<=ec ; i++ ){
                a[sr][i]=num;
                num++;
                count++;
            }
            sr++;

            for(int i = sr; count<total && i<=er ; i++ ){
                a[i][ec]=num;
                num++;
                count++;
            }
            ec--;

            for(int i = ec; count<total && i>=sc ; i-- ){
                a[er][i]=num;
                num++;
                count++;
            }
            er--;

            for(int i = er; count<total && i>=sr ; i-- ){
                a[i][sc]=num;
                num++;
                count++;
            }
            sc++;
        }
        for(int i =0; i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        //witout total and count, when the arr is n*n;
        /*while(sc<ec && sr<er){

            for(int i =sc;i<=ec ; i++ ){
                a[sr][i]=num;
                num++;
            }
            sr++;

            for(int i = sr;i<=er ; i++ ){
                a[i][ec]=num;
                num++;
            }
            ec--;

            for(int i = ec;i>=sc ; i-- ){
                a[er][i]=num;
                num++;
            }
            er--;

            for(int i = er;i>=sr ; i-- ){
                a[i][sc]=num;
                num++;
            }
            sc++;
        }*/

    }
}