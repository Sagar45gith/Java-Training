public class specialNumber{
    public static void main(String[] args){
        int a = 78;
        int first = a/10;
        int sec = a%10;

        int sum = first+sec;
        int product = first*sec;

        if(sum+product == a){
            System.out.println("Special Number");
        }
        else{
            System.out.println("Not a Special Number");
        }
    }
}