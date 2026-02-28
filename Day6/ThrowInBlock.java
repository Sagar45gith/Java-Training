public class ThrowInBlock{
    public static void main(String[] args){
        try{
            System.out.println("Inside Try Block");
            throw new ArithmeticException("Exception Thrown in Try Block");
        }
        catch(ArithmeticException e){
            System.out.println("Caught Arithmetic Exception: "+e.getMessage());
            throw new NullPointerException("Exception Thrown in Catch Block");
            //Retherowing the exception to be caught by the caller or to propagate it further
        }
        finally{
            System.out.println("Inside Finally Block");
            throw new IllegalStateException("Exception Thrown in Finally Block");
            //This will override the exception thrown in catch block and will be the one that propagates out of the method
        }
    }
}