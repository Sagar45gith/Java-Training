import java.util.ArrayList;
public class Generics{
    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(123);
        list.add(true);
        list.add(3.14);
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}

//Without using <Object>, then if we try to add different types of data, it will give a compile-time error. For example:
/*
import java.util.ArrayList;
public class Generics{
    public static void main(String[] args){
        ArrayList list = new ArrayList<>();
        list.add("Hello");
        list.add(123); // Compile-time error: incompatible types: int cannot be converted to String
        for(int i =0;i<list.size();i++){
            String str = (String) list.get(i); // This will throw a ClassCastException at runtime when it tries to cast an Integer to a String
            System.out.println(str);
        }
    }
}*/
