package LibraryManagement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);
        Scanner sc = new Scanner(System.in);

        library.addBook(new Book(1, "Java Programming", "James Gosling"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(3, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(4, "Data Structures", "Mark Allen Weiss"));

        System.out.println("All Available Books:");
        library.displayAllBooks();

        System.out.print("\nEnter Book Title to Search (Linear): ");
        String title1 = sc.nextLine();
        Book foundLinear = library.linearSearchByTitle(title1);
        System.out.println(foundLinear != null ? "Found: " + foundLinear : "Not Found");

        System.out.print("\nEnter Book Title to Search (Binary): ");
        String title2 = sc.nextLine();
        Book foundBinary = library.binarySearchByTitle(title2);
        System.out.println(foundBinary != null ? "Found: " + foundBinary : "Not Found");

        sc.close();
    }
}
