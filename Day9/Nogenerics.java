import java.util.LinkedList;

class STUDENT {
    private String USN;
    private String Name;

    STUDENT(String usn, String name) {
        this.USN = usn;
        this.Name = name;
    }
    @Override
    public String toString() {
        return "USN: " + USN + ", Name: " + Name;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        LinkedList<STUDENT> students = new LinkedList<>();
        students.add(new STUDENT("1AJ21CS001", "Rahul"));
        students.add(new STUDENT("1AJ21CS002", "Sneha"));
        students.add(new STUDENT("1AJ21CS003", "Arjun"));

        System.out.println("Student List:");
        for (STUDENT s : students) {
            System.out.println(s);
        }
    }
}
