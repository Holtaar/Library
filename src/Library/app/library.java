package Library.app;

import Library.model.book;

public class library {

    public static void main(String[] args) {

        book ksiazka1 = new book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296,
                "Greg", "9788373271890");
        book ksiazka2 = new book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009, 352, "Helion",
                "9788324620845");
        book ksiazka3 = new book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
                2008, 851, "McGraw-Hill Osborne Media");


        System.out.println("Ksiązki w bibliotece");
        ksiazka1.printinfo();
        ksiazka2.printinfo();
        ksiazka3.printinfo();
    }
}

