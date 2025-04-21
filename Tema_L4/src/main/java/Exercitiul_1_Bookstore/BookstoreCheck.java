package Exercitiul_1_Bookstore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BookstoreCheck {

    public static void checkDouble(BookstoreTest books) {
        System.out.println("Which is the book you want to check if it's doubled? Type the Title");
        Scanner sc = new Scanner(System.in);
        String bookTitle = sc.nextLine();
        Book book = null;
        for (Book carte : books.getBooks()) {
            if (carte.getTitle().equals(bookTitle)) {
                book = carte;
                break;
            }
        }
        if (book == null) {
            System.out.println("That is not a valid book to check");
            return;
        }

        boolean foundDuplicate = false;
        for (Book carte : books.getBooks()) {
            if (carte == book) continue;

            if (carte.getAuthor().equals(book.getAuthor()) &&
                    carte.getTitle().equals(book.getTitle()) &&
                    carte.getPublisher().equals(book.getPublisher()) &&
                    carte.getPageCount() == book.getPageCount()) {
                foundDuplicate = true;
                break;
            }
        }
        if (!foundDuplicate)
            System.out.println("No book found with title " + bookTitle);
        else
            System.out.println("Book " + bookTitle + " is doubled");
    }

    public static Book comparePageCount(BookstoreTest books) {
        Book b1 = null, b2 = null;
        System.out.println("Which two books do you want to compare? Type the Title");
        Scanner sc = new Scanner(System.in);
        String bookTitle = null;
        while (true) {
            bookTitle = sc.nextLine();
            for (Book carte : books.getBooks()) {
                if (carte.getTitle().equals(bookTitle)) {
                    b1 = carte;
                    break;
                }
            }
            if (b1 == null)
                System.out.println("First book is not a valid book to check. Retry.");
            else
                break;
        }

        bookTitle = null;
        while (true) {
            bookTitle = sc.nextLine();
            for (Book carte : books.getBooks()) {
                if (carte.getTitle().equals(bookTitle)) {
                    b2 = carte;
                    break;
                }
            }
            if (b2 == null)
                System.out.println("Second book is not a valid book to check. Retry.");
            else
                break;
        }


        if (b1.getPageCount() > b2.getPageCount())
            return b1;
        else
            return b2;
    }
}
