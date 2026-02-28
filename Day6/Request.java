public class Request{
    public static void main(String[] args){
        Test1 t1 = new Test1();
        System.out.println(t1);
        t1=null;
        System.out.println(t1);

        System.gc();    //Requesting the Java Virtual Machine (JVM) to perform garbage collection. This is a hint to the JVM that it can reclaim memory from objects that are no longer in use. 
        // However, it's important to note that calling System.gc() does not guarantee that garbage collection will occur immediately, as the JVM may choose to ignore the request or delay it based on its own optimization strategies.
        System.out.println("Garbage collection requested");
        
    }
}