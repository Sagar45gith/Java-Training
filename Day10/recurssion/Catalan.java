public class Catalan{
    static int cat(int n){
        if(n==0 || n==1){
            return 1;
        }
        int res =0;
        for(int i =0;i<n;i++){
            res+=cat(i)*cat(n-i-1);
        }
        return res;
    }
    public static void main(String[] args){
        int t = 10;
        System.out.println("Catalan Number Series: ");
        for(int i =0;i<t;i++){
            System.out.println(cat(i)+" ");
        }
    }
}

// The nth catalan number is given by the formula: C(n) = (2n)!/((n+1)!*n!)
// The nth catalan number can also be calculated using the formula: C(n) = C(0)*C(n-1) + C(1)*C(n-2) + ... + C(n-1)*C(0)
// The nth catalan number can also be calculated using the formula: C(n) = (2n)!/(n!*(n+1)!)