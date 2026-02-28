//Exception is the subclass of Throwable
//GC is the Subclass of Exception

//coustum exception
class GC extends Exception{     //GC is the custom exception class that extends Exception
    GC(String message){         //Constructor that takes a message and passes it to the superclass constructor
        super(message);         //Calling the constructor of the superclass (Exception) to set the exception message
    }    
}

public class LibraryDemo{
    static void CheckAttendance(boolean absent)throws GC{
        if(absent){
            throw new GC("Penalty to submit 3 books in Library");
        }
        else{
            System.out.println("Present in class: No penalty");
        }
    }
    public static void main(String[] args){
        try{
            CheckAttendance(true); // Simulating an absent student, which will throw the custom exception GC
        }
        catch(GC e){
            System.out.println("Caught Exception: "+e.getMessage()); // Catching the custom exception and printing its message
        }
    }
}