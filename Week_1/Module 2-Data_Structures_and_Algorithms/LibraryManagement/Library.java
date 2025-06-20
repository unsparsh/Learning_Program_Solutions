package LibraryManagement;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    Book[] books;
    int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        }
    }

    // Linear Search by Title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary Search
    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, size, Comparator.comparing(b -> b.title.toLowerCase()));

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int result = books[mid].title.compareToIgnoreCase(title);

            if (result == 0) return books[mid];
            if (result < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public void displayAllBooks() {
        if (size == 0) {
            System.out.println("No books available.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
