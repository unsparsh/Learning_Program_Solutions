package EmployeeManagement;

public class EmployeeService {
    private Employee[] employees;
    private int size;

    public EmployeeService(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add employee
    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
            System.out.println("Employee added.");
        } else {
            System.out.println("Employee list is full.");
        }
    }

    // Search by ID
    public Employee searchById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Delete by ID
    public void deleteById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Traverse all – O(n)
    public void printAllEmployees() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("All Employees:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}
