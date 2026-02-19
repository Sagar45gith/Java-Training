public class plaindrome{
    public static void main(String[] args){
        int a = 101;
        int og=a;
        int rev = 0;
        while(a>0){
            int d=a%10;
            rev = rev*10 + d;
            a=a/10;
        }
        if(rev==og){
            System.out.print("plaindrome");
        }
        else{
            System.out.print("Not a plaindrome");
        }
    }
}