package EmployeeManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService(5); // max 5 employees for this demo
        Scanner sc = new Scanner(System.in);

        // Add some employees
        service.addEmployee(new Employee(101, "Sparsh", "Software Engineer", 500000));
        service.addEmployee(new Employee(102, "Hetal", "HR Manager", 60000));
        service.addEmployee(new Employee(103, "Aryan", "Analyst", 48000));

        service.printAllEmployees();

        // Search
        System.out.print("\nEnter Employee ID to search: ");
        int id = sc.nextInt();
        Employee found = service.searchById(id);
        System.out.println(found != null ? found : "Not Found");

        // Delete
        System.out.print("\nEnter Employee ID to delete: ");
        int delId = sc.nextInt();
        service.deleteById(delId);

        // Print again
        service.printAllEmployees();

        sc.close();
    }
}
