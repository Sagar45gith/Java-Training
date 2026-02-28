import java.util.*;
public class ThrowableException{
    public static void main(String[] main){
    try{
        int a = 10;
        int b =0;
        if(b==0){
            throw new Throwable("Division by Zero");
        }
        int result = a/b;
        System.out.println("Result: "+result);
    }
    catch(Throwable t){
        System.out.println("Caught Exception: "+t.getMessage());
    }
    }
}