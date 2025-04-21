package Exercitiul_1_Bookstore;

import java.util.ArrayList;
import java.util.Scanner;

public class BookstoreTest {
    private final ArrayList<Book> Books;

    public BookstoreTest(ArrayList<Book> books) {
        this.Books = books;
    }

    public void createBook() {
        String title, author, publisher;
        int pageCount;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert author (String): ");
        author = in.nextLine();
        System.out.println("Insert title (String): ");
        title = in.nextLine();
        System.out.println("Insert publisher (String): ");
        publisher = in.nextLine();
        System.out.println("Insert pageCount (Int): ");
        pageCount = Integer.parseInt(in.nextLine());
        while (pageCount <= 0) {
            System.out.println("Page count must be greater than 0. Try again.");
            pageCount = Integer.parseInt(in.nextLine());
        }
        Books.add(new Book(title, author, publisher, pageCount));
    }

    public void deleteBook() {
        Scanner in = new Scanner(System.in);
        System.out.println("Which book do you want to delete? (index from 1 to " + (Books.size()) + ")");
        System.out.println(getBooks());
        System.out.print("--> ");
        int bookNumber = in.nextInt();
        if (bookNumber >= 1 && bookNumber <= Books.size()) {
            Books.remove(bookNumber - 1);
            System.out.println("Book deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }


    public void updateBook() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert the title (String) of the book you want to update: ");
        System.out.println(Books);
        String bookTitle = in.nextLine();
        int book = 0;
        for (var index = 0; index < Books.size(); index++) {
            if (Books.get(index).getTitle().equals(bookTitle))
                book = index;
        }
        while (true) {
            System.out.println("What do you want to update?");
            System.out.println("Choose one of the following: Author, Title, Publisher, PageCount");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextLine()) {
                case "Author":
                    System.out.println("What's the new author?");
                    Books.get(book).setAuthor(sc.nextLine());
                    break;

                case "Title":
                    System.out.println("What's the new title?");
                    Books.get(book).setTitle(sc.nextLine());
                    break;

                case "Publisher":
                    System.out.println("What's the new publisher?");
                    Books.get(book).setPublisher(sc.nextLine());
                    break;

                case "PageCount":
                    System.out.println("What's the new page count?");
                    int pageCount = Integer.parseInt(sc.nextLine());
                    while (pageCount <= 0) {
                        System.out.println("Page count must be greater than 0. Try again.");
                        pageCount = Integer.parseInt(sc.nextLine());
                    }
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("Do you still want to proceed?");
            switch (sc.nextLine()) {
                case "Yes":
                    break;
                case "No":
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public void readBooks() {
        System.out.println(Books);
    }

    public ArrayList<Book> getBooks() {
        return Books;
    }

    @Override
    public String toString() {
        return "Current books available:" +
                Books
                + "\n";
    }
}
