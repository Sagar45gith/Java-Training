/* 
Q. Diff b/w Encap and Abstraction?
Ans. Encap is the process of wrapping data and code together as a single unit. 
It is a fundamental concept in OOP that helps to protect the data from unauthorized access and modification.
Encapsulation permits us the control over the data by providing getter and setter methods to access and modify the data.
Encapsulation is achieved through the use of access modifiers (private, protected, public) and getter/setter methods.


Abstraction is the process of hiding the implementation details and showing only the functionality to the user. 
It is a fundamental concept in OOP that helps to reduce complexity and increase efficiency.

Q. Diff b/w initsilazing with constructor and setter method?
Ans. Initializing with constructor is a way to set the initial values of an object when it is created. 
It is a special method that is called when an object is instantiated. 
The constructor can take parameters to initialize the object's attributes. Constructor declares all variables at the time of object creation and initializes them with the provided values.

Initializing with setter method is a way to set the values of an object's attributes after it has been created.
It is a method that is used to set the value of an attribute after the object has been instantiated.
The setter method can be called multiple times to change the value of the attribute, while the constructor is called only once when the object is created.
*/

//Creating an object = Allocating the memory.
//new keyword in java = used for creating the object
//In cpp new is used for allocating memory (Dynamic allocation)


public class Encap{
    private String name;
    private String power;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setPower(String power){
        this.power=power;
    }

    public String getPower(){
        return power;
    }

    void display(){
        System.out.println("Hero:"+name);
        System.out.println("Power:"+power);
    }

    public static void main(String[] args){
        Encap ob = new Encap();
        ob.setName("Saul");
        ob.setPower("Lawyerr");
        ob.display();
        System.out.println(ob.getName());
        System.out.println(ob.getPower()); 
    }
}