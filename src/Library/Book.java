package Library;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String bookTitle,String bookAuthor, int bookReleaseDate, int bookPages, String  bookPublisher, String bookIsbn){
        title=bookTitle;
        author=bookAuthor;
        releaseDate=bookReleaseDate;
        publisher=bookPublisher;
        isbn=bookIsbn;

    }
    void printInfo(){

        String info = title + "; " + author+ "; "+releaseDate+ "; "+pages+ "; "+publisher+ "; "+isbn;
        System.out.println(info);
    }

}