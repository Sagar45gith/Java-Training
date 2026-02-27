public class CheckedUnchecked{
    public static void main(String[] args){
        System.out.println("Checked Exception");

        System.out.println("IOException");
        System.out.println("FileNotFoundException");
        System.out.println("ClassNotFoundException");
        System.out.println("SQLException");
        System.out.println("InterruptedException");
        System.out.println("ParseException");
        System.out.println("NoSuchMethodException");
        System.out.println("InstantiationException");
        System.out.println("NoSuchFieldException"); // this exception is thrown when we try to access a field that does not exist in the class.
        System.out.println("IllegalAccessException"); // this exception is thrown when we try to access a field that is not accessible, for example, if the field is private and we try to access it from outside the class.

        System.out.println("-----------------------------------");
        System.out.println("Unchecked Exception");
        System.out.println("ArithmeticException");
        System.out.println("NullPointerException");
        System.out.println("ArrayIndexOutOfBoundsException");
        System.out.println("StringIndexOutOfBoundsException");
        System.out.println("NumberFormatException");
        
    }
}