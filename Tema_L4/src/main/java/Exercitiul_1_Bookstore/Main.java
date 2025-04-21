package Exercitiul_1_Bookstore;

import java.util.ArrayList;
import java.util.Scanner;

import static Exercitiul_1_Bookstore.BookstoreCheck.checkDouble;
import static Exercitiul_1_Bookstore.BookstoreCheck.comparePageCount;

public class Main {
    public static void main(String[] args) {
//        Book carte = new Book("Ion", "Ion", "Ion", 3);
//        Book carte1 = new Book("Ion1", "Ion1", "Ion1", 4);
        ArrayList<Book> books = new ArrayList<Book>();
        BookstoreTest Bookstore = new BookstoreTest(new ArrayList<Book>());
//        Bookstore.createBook(carte);
//        Bookstore.createBook(carte1);
//        System.out.println(Bookstore);
//        Bookstore.deleteBook(0);
//        System.out.println(Bookstore);

        Scanner in = new Scanner(System.in);
        String choice;
        int exit = 0;
        while (true) {
            System.out.println("Make your choice: ");
            System.out.println("1. Insert new book");
            System.out.println("2. Delete book");
            System.out.println("3. Update book");
            System.out.println("4. See books");
            System.out.println("0. Exit");
            System.out.print("--> ");
            switch (choice = in.nextLine()) {
                case "1":
                    Bookstore.createBook();
                    break;

                case "2":
                    Bookstore.deleteBook();
                    break;

                case "3":
                    Bookstore.updateBook();
                    break;

                case "4":
                    Bookstore.readBooks();
                    break;

                case "5":
                    checkDouble(Bookstore);
                    break;

                case "6":
                    comparePageCount(Bookstore);
                    break;

                case "0":
                    exit = 1;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
            System.out.println();
            System.out.println();
            if (exit == 1) break;
        }
    }
}
