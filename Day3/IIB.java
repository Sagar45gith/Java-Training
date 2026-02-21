public class IIB{
    int runs;
    String Name;
    //IIB - instance intialization block, runs before constructor.
    {
        System.out.println("Inside IIB");
        Name="Kohli";
        runs=100;
    }
    IIB(){
        System.out.println("Inside Constructor");
        //runs=264;
        //Name="Rohit Sharma";

    }
    static{
        System.out.println("I'm Static");
    }
    void display(){
        System.out.println(Name+" "+runs);
    }
    public static void main(String[] args){
        IIB ob = new IIB();
        IIB ob1 = new IIB();
        IIB ob2 = new IIB();
        //System.out.println()
        ob.display();
    }
}

/* IIB and Consturctor runs (the number of times the object is created). 
static runs only once (before main)
Cant pass values into IIB, should be given inside the IIB. (DIFF B/w Constuctor and IIB)
*/
