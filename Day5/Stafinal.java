class xyz{
    static final String name = "Sagar";   // final variable cannot be modified.
}

public class Stafinal{
    public static void main(String[] args){
        System.out.println(xyz.name);
        // xyz.name = "Shekhar";   // cannot modify final variable.
    }
}