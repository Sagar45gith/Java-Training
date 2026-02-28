public class Finalize{
    protected void finalize(){
        System.out.println("Finalize called");
    }
    public static void main(String[] args){
        Finalize f = new Finalize();
        f=null;
        System.gc();
    }
}

//Explain: In this code, we have a class named Finalize with a finalize method. The finalize method is called by the garbage collector when it determines that there are no more references to the object.
//  In the main method, we create an instance of Finalize and then set the reference to null, making it eligible for garbage collection. We then call System.gc() to request the JVM to perform garbage collection. When the garbage collector runs, 
// it will call the finalize method of the Finalize object, which will print "Finalize called" to the console. However, it's important to note that calling System.gc() does not guarantee that garbage collection will occur immediately, 
// as the JVM may choose to ignore the request or delay it based on its own optimization strategies.   

//Heap Structure in Genrational GC
/*
Young Generation:
    - Eden Space: This is where new objects are allocated. When an object is created, it is initially placed in the Eden space.
    - Survivor Space 1 (S1): This is one of the two survivor spaces. When the Eden space fills up, the surviving objects are moved to one of the survivor spaces (S1 or S2).
    - Survivor Space 2 (S2): This is the other survivor space. The surviving objects from S1 are moved to S2 during the next garbage collection cycle.
Old Generation (Tenured Generation):
    - This is where long-lived objects are stored. When objects survive multiple garbage collection cycles in the survivor spaces, they are eventually promoted to the old generation. The old generation is typically larger than the young generation and is collected less frequently.
Permanent Generation (Metaspace in Java 8 and later):
    - This is where class metadata and other static data are stored. In Java 8 and later, the permanent generation has been replaced by metaspace, which is allocated in native memory rather than the heap.
The generational garbage collection approach is based on the observation that most objects in a program are short
-lived, and therefore, the young generation is collected more frequently than the old generation. This allows for efficient memory management and improved performance in Java applications.
*/