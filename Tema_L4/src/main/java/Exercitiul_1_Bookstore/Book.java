package Exercitiul_1_Bookstore;

public class Book {
    private String title, author, publisher;
    private int pageCount;

    public Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public Book(Book book){
        this.title = book.title;
        this.author = book.author;
        this.publisher = book.publisher;
        this.pageCount = book.pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return
                "\n" +
                "BOOK_TITLE: " + this.title.toUpperCase() + "\n" +
                "BOOK_AUTHOR: " + this.author + "\n" +
                "BOOK_PUBLISHER: " + this.publisher.toLowerCase() + "\n" +
                "BOOK_PAGE COUNT: " + this.pageCount + "\n";
    }
}
