public class Main {
    public static void main(String[] args) {
        // Creating the Model
        Student student = new Student("Hetal", "101", "A");

        // Creating the View
        StudentView view = new StudentView();

        // Creating the Controller
        StudentController controller = new StudentController(student, view);

        // Display initial data
        controller.updateView();

        // Update model data via controller
        controller.setStudentName("Sparsh Sigh");
        controller.setStudentGrade("A++");

        // Display updated data
        controller.updateView();
    }
}
