import java.util.*;
    class Employee {
    //  We are using protected member variables
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        // Creating an instance of Employee in detail
        Employee emp = new Employee();

        // Assigning values according to me
        emp.id = 9;
        emp.name = "Nitesh Kumar Sharma";
        emp.isPermanent = true;

        // Attempt to assign 22.5 to age - corrected by casting
        emp.age = (int) 22.5; // Casting double to int

        // Printing assigned values according to above
        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.id);
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Permanent: " + emp.isPermanent);

        // Print successfully in  message
        System.out.println("Successfully started");
    }
}

