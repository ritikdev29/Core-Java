// import java.util.*;
import java.util.*;

class Library {
    String [] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
        

    }
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book : this.books) {
            if(book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook (String book) {
        for (int i =0; i<this.books.length; i++){
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issue...");
                this.books[i] = null;
                
                return;

                
            }
        }
            System.out.println("This book does not exist....");
    }
        
        void returnBook (String book) {
            addBook(book);
        }

    }


public class chw_61_ch11ps{
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("java concept..");
        centralLibrary.addBook("c language concept..");
        centralLibrary.addBook("DLD concept..");
        centralLibrary.addBook("Complex Analsis concept..");
        // centralLibrary.addBook("java 2 concept..");

        // 

        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("java concept..");
        // centralLibrary.issueBook("DLD concept..");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("hello.com");
        centralLibrary.showAvailableBooks();
        centralLibrary.addBook("java concept..");
        centralLibrary.showAvailableBooks();



        
    }
}