public class StringPool{
    public static void main(String[] args){
        String s1 = "Daemon";
        String s2 = "Daemon";
        String s3 = new String("Daemon");
        String s4 = new String("Daemon");

        System.out.println("s1==s2: "+(s1==s2));
        System.out.println(s1.equals(s2));
        System.out.println("s1==s3: "+(s1==s3));
        System.out.println(s1.equals(s4));

        //intern() method  
        String s5=s3.intern();  //intern() method returns a canonical representation for the string object. It returns a reference to the string object from the string pool if it is already present, otherwise it adds the string to the pool and returns a reference to it.
        System.out.println("s1==s5: "+(s1==s5));
    }
}