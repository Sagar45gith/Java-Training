public class OddEven{

    static void odd(int n,int limit){
        if(n>limit){
            return ;
        }
        System.out.print((n+1)+ " ");
        even(n+1,limit);
    }
    static void even(int n, int limit){
        if(n>limit){
            return ;
        }
        System.out.print((n-1)+" ");
        odd(n+1,limit);
    }
    public static void main(String[] args){
        int limit = 10;
        odd(1,limit);
    }
}