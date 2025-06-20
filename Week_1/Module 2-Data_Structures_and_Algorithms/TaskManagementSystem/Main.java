package TaskManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);

        manager.addTask(1, "Complete Assignment", "Pending");
        manager.addTask(2, "Review PR", "In Progress");
        manager.addTask(3, "Submit Report", "Pending");

        System.out.println("\nAll Tasks:");
        manager.showAllTasks();

        System.out.print("\nEnter Task ID to search: ");
        int searchId = sc.nextInt();
        Task found = manager.searchTask(searchId);
        System.out.println(found != null ? "Found: " + found : "Not Found");

        System.out.print("\nEnter Task ID to delete: ");
        int deleteId = sc.nextInt();
        manager.deleteTask(deleteId);

        System.out.println("\nUpdated Tasks:");
        manager.showAllTasks();

        sc.close();
    }
}

