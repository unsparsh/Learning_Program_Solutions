package TaskManagementSystem;

public class TaskManager {
    private Task head;

    // Add Task at the end – O(n)
    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newTask;
    }

    // Search by Task ID – O(n)
    public Task searchTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) return current;
            current = current.next;
        }
        return null;
    }

    // Delete by Task ID – O(n)
    public void deleteTask(int id) {
        if (head == null) return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task current = head;
        while (current.next != null && current.next.taskId != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Traverse – O(n)
    public void showAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
