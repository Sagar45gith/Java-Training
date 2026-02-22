package package2;
import Package1.Student;

public class Person extends Student{
    public void displayDetails(){
        System.out.println("Public "+NAME);
        System.out.println("Protected "+AGE);
        showname();
        showage();
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.displayDetails();
        Student p2 = new Student();
        System.out.println(p2.NAME);
        //System.out.println(p2.AGE);
    }
}