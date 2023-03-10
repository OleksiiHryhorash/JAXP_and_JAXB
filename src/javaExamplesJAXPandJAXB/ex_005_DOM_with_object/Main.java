package javaExamplesJAXPandJAXB.ex_005_DOM_with_object;

import javaExamplesJAXPandJAXB.ex_005_DOM_with_object.entity.Book;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        BookHelper bh = new BookHelper();

        Book book = new Book();

        book.setId("05");
        book.setIsdn(777);
        book.setAuthor("Taras Shevchenko");
        book.setTitle("Zapovit");

        bh.addBook(book);

        System.out.println("------------");

        List<Book> books = bh.getAll();

        for (Book b : books)  {
            System.out.println(b.getId() +  " " + b.getIsdn()
                    + " " + b.getAuthor() + " " + b.getTitle());
        }

    }

}
