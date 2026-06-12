import java.util.*;

class Library {
    private ArrayList<String> availableBooks = new ArrayList<>();
    private ArrayList<String> issuedBooks = new ArrayList<>();

    // Add Book
    public void addBook(String book) {
        availableBooks.add(book);
        System.out.println(book + " added to library.");
    }

    // Issue Book
    public void issueBook(String book) {
        if (availableBooks.remove(book)) {
            issuedBooks.add(book);
            System.out.println(book + " issued.");
        } else {
            System.out.println("Book not available.");
        }
    }

    // Return Book
    public void returnBook(String book) {
        if (issuedBooks.remove(book)) {
            availableBooks.add(book);
            System.out.println(book + " returned.");
        } else {
            System.out.println("This book was not issued.");
        }
    }

    // Show Books
    public void showAvailableBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available Books:");
            for (String b : availableBooks) System.out.println(" - " + b);
        }
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show Available Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    lib.addBook(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter book name to issue: ");
                    lib.issueBook(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter book name to return: ");
                    lib.returnBook(sc.nextLine());
                    break;
                case 4:
                    lib.showAvailableBooks();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
