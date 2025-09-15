public class Student {
    int rollNo;
    String name;
    float marks;
    static String schoolName = "Maharana Pratap";  

   
    public Student() {
        System.out.println("Default constructor called");
    }

  
    public Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

   
    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    
    public Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.marks = s.marks;
    }

   
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
        System.out.println("Marks  : " + marks);
        System.out.println("School : " + schoolName);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
      
        Student s1 = new Student(101, "Ratan Tata", 95.5f);
        Student s2 = new Student(102, "APJ Abdul Kalam");
        Student s3 = new Student(103);
        Student s4 = new Student(s1); 

        System.out.println("Student 1:");
        s1.display();

        System.out.println("Student 2:");
        s2.display();

        System.out.println("Student 3:");
        s3.display();

        System.out.println("Student 4 (copy of Student 1):");
        s4.display();
    }
}
