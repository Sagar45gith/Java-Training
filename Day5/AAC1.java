class Dept {
    String deptName;       
    
    Dept(String deptName) {
        this.deptName = deptName;
    }
}

class College {
    String collegeName;  
    
    // AGGREGATION HAPPENS HERE:
    // The College HAS a Dept. It stores it as a class variable.
    Dept dept;            
    
    // Notice how the constructor takes an ALREADY EXISTING Dept object.
    // The College does not create the Dept itself.
    College(String collegeName, Dept dept) {
        this.collegeName = collegeName;
        this.dept = dept;
    }

    void display() {        
        System.out.println(this.collegeName + " belongs to department " + dept.deptName);   
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        // 1. The Part (Dept) is created entirely on its own first.
        Dept d = new Dept("Computer Science");
        
        // 2. The Whole (College) is created, and we pass the Part inside it.
        College c = new College("Sapthagiri NPS University", d);  
        c.display();   
        
        // 3. Lifecycle proof: If we destroy the College (c = null), 
        // the Dept 'd' still exists in the main method and can be used elsewhere!
    }
}