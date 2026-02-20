import java.util.*;
public class construc{

    int a; //instance variable
    construc(){  //default
        //this(10);
        System.out.println("Default Constructor");
    }
    construc(int a){  //patrameterized
        this();
        this.a=a; 
        System.out.println("Parameterzied");   
    }
    void display(){
        System.out.println("I am "+a);
    }
    public static void main(String[] args){
        //construc ob =  new construc(); //calls default 
        construc ob =  new construc(50); //calls patrameterized
        ob.display();
    }
}