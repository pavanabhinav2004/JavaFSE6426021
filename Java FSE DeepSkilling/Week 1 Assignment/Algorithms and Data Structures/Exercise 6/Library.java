import java.util.Arrays;
import java.util.Comparator;

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

public class Library {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Algorithms", "Cormen"),
            new Book(2, "Data Structures", "Lafore"),
            new Book(3, "Java Basics", "Gosling")
        };

        linearSearch(books, "Java Basics");

        sortBooksByTitle(books);
        binarySearch(books, "Java Basics");
    }

    static void linearSearch(Book[] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equals(title)) {
                System.out.println("Found (Linear): " + books[i].title);
                return;
            }
        }
        System.out.println("Not found (Linear)");
    }

    static void binarySearch(Book[] books, String title) {
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareTo(title);
            if (cmp == 0) {
                System.out.println("Found (Binary): " + books[mid].title);
                return;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Not found (Binary)");
    }

    static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, new Comparator<Book>() {
            public int compare(Book a, Book b) {
                return a.title.compareTo(b.title);
            }
        });
    }
}
