public class MultipleThrows{
    static void checkValues(int num, String text) throws ArithmeticException, NullPointerException{
    if(num<0){
        throw new ArithmeticException("Number cant be negative");
    }
    if(text==null){
        throw new NullPointerException("Text cant be null");
    }
    System.out.println(num+" "+text);
    }
    public static void main(String[] main){
        try{
            checkValues(-5,null);
        }
        catch( ArithmeticException c){     
            System.out.println("Caught Exception "+c.getMessage());
        }
        catch(NullPointerException n){
            System.out.println("Caught Exception "+n.getMessage());
        }
        finally{
            System.out.println("Finally Block Executed");
        }
    }
}
