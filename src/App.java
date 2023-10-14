class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
    return ("ID: " + id + " _" + "Full name " + name);
    }
}

public class App {
    public static void main(String[] args) {

        Employee employee1 = new Employee(101, "Wahab salam");
        Employee employee2 = new Employee(201, "Aishat Salam");

        System.out.println(employee1);
        System.out.println(employee2);
        
    }
    
}
