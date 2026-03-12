public class RecurrDemo{
    public static int fact(int n){
        System.out.println("Calling factorial "+n);
        if(n==0 || n==1){
            return 1;
        }
        int res = n*fact(n-1);
        System.out.println("Returning "+res+ " from factorail(" +n+")");
        return res;
    }
    public static void main(String[] args){
        int res = fact(5);
    }
}