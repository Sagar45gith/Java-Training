import java.util.*;
public class methead{

    static{
        System.out.println("This is method 2");
    }
    void method1(){
        System.out.println("This is method 1");
    }
    public static void main(String[] args){
        System.out.println("This is main method");
        methead m1 = new methead();
        m1.method1();
    }
}