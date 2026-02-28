/*public class Test1{
    public static void main(String[] args){
        Test1 t1 = new Test1();
        System.out.println(t1);
        //t1=null;
        //System.out.println(t1);
        //Case 2: Reassigning Refrence
        t1=new Test1();
        System.out.println(t1);
    }
}*/

//Explain:
//In this code, we have a class named Test1 with a main method. Inside the main method, we create an instance of Test1 and print its reference. 
// Then, we reassign the reference to a new instance of Test1 and print it again. The output will show two different memory addresses for the two instances of Test1, indicating that they are different objects in memory.
//Note: The lines that set t1 to null and print it are commented out, so they will not execute. If you uncomment those lines, it will show that t1 is null after being set to null.

/*public class Test1{
    void display(){
        Test1 t1 = new Test1();
        System.out.println(t1);
    }
    public static void main(String[] args){
        Test1 t1 = new Test1();
        System.out.println(t1);
        t1.display();

        //anonymous object : can destroy on it own after use
        new Test1().display(); //Creating an anonymous object of Test1 and calling the display method on it. This will create a new instance of Test1, call the display method, and then the reference to that instance will be lost after the method call.
    }    
}*/

//island of isolation: An anonymous object is an instance of a class that is created without being assigned to a reference variable. 
// It is often used when you want to call a method on an object without needing to keep a reference to it. In the example above, new Test1().display() creates an anonymous object of Test1 and calls the display method on it. 
// After the method call, there is no reference to that instance, and it becomes eligible for garbage collection.
public class Test1{
    Test1 ref;
    public static void main(String[] args){
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        t1.ref = t2; //t1's ref is pointing to t2
        t2.ref = t1; //t2's ref is pointing to t1

        t1=null; //t1 is now eligible for garbage collection, but since t2's ref is still pointing to t1, t1 will not be collected by the garbage collector. 
        // This creates a circular reference between t1 and t2, which can lead to memory leaks if not handled properly.
        t2=null;

        System.out.println(t1); //Prints the reference of t1
        System.out.println(t2); //Prints the reference of t2
        System.out.println(t1.ref); //Prints the reference of t2 (since t1.ref points to t2)
        System.out.println(t2.ref); //Prints the reference of t1 (since t2.ref points to t1)
    }
}



//nullifying reference: When you set a reference variable to null, it means that the variable no longer points to any object in memory.  
//refiguring reference: When you reassign a reference variable to point to a different object, the original object that the variable pointed to may become eligible for garbage collection if there are no other references to it.  
//object creataing: When you create an object using the new keyword, it allocates memory for that object and returns a reference to it. This reference can be stored in a variable, passed as an argument to a method, or used in any other way that a reference can be used.
//anaoymous object: An anonymous object is an instance of a class that is created without being assigned to a reference variable. It is often used when you want to call a method on an object without needing to keep a reference to it. For example, new Test1().display() creates an anonymous object of Test1 and calls the display method on it. After the method call, there is no reference to that instance, and it becomes eligible for garbage collection.
//island of isolation: An island of isolation refers to a situation where an object is not referenced by any other object, making it eligible for garbage collection. This can happen when all references to an object are set to null or when the object is created as an anonymous object and there are no references to it after its use. In such cases, the object becomes an "island of isolation" in memory, as it cannot be accessed or referenced by any other part of the program.