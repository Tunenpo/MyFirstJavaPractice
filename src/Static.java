class Student {

    public static final int MY_CONSTANT = 5;

    public String name;
    public static String studentClass;  
    public static int count = 0;
    public Student() {
        count++;
    }

    public void studentName() {
        //System.out.println("name ");
        System.out.println(name + " is enrolled in: " + studentClass);
    }

    public static void classInfo() {
        System.out.println(studentClass);
    }

}

public class Static {
    public static void main(String[] args) {

        Student.studentClass = "Web Development Fundamentals";
        System.out.println(Student.studentClass);

        Student.classInfo();

        System.out.println("Before creating objects: " + Student.count);

        Student student1 = new Student();
        Student student2 = new Student(); 

         System.out.println("After creating objects: " + Student.count);

        student1.name = "Abdwahab";
        student2.name = "Abdsalam";

        student1.studentName();
        student2.studentName();

        System.out.println(Math.E);
        System.out.println(Student.MY_CONSTANT);

        
    }

}
