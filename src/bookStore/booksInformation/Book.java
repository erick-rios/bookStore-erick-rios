package bookStore.booksInformation;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;


public class Book {
    private int              id;
    private String         name;
    private Autor[]     authors;
    private Publisher publisher;
    private int  publishingYear;
    private int   amountOfPages;
    private BigDecimal    price;
    private CoverType CoverType;

    public Book(){};

    public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages, BigDecimal price, CoverType CoverType){
        
        this.id             = id;
        this.name           = name;
        this.authors        = authors;
        this.publisher      = publisher;
        this.publishingYear = publishingYear;
        this.amountOfPages  = amountOfPages;
        this.price          = price;
        this.CoverType      = CoverType;

    }

    @Override
    public String toString(){
        return "[Id: "+ id+ "\nName: "+ name +"\nAuthor " + Arrays.toString(authors)+ "\nPublishing Year: " + publishingYear + "\nAmount of Pages: " + amountOfPages + "\nPrice " + price + "\nCover Type: " + CoverType + "]";
    }
    
}
