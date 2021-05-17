package Library.model;

public class book {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    public book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn = isbn;


    }

    public book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tile) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(java.lang.String isbn) {
        this.isbn = isbn;

    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void printinfo() {

        String info = "Tytuł: " + title + " Autor: " + author + " Data wydania: " + releaseDate +
                "Liczba stron: " + pages + " Wydanie: " + publisher + " Numer ISBN: ";
        if (isbn != null) {
            info = info + "Numer ISBN " + isbn;

        }
        System.out.println(info);

    }

}
