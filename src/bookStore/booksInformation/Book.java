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

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthors(Author[] authors){
        this.authors = authors;
    }
    public void setPublisher(Publisher publisher){
        this.publisher = publisher;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
    public void setAmountOfPages(int amountOfPages){
        this.amountOfPages = amountOfPages;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    

    @Override
    public String toString(){
        return "[Id: "+ id+ "\nName: "+ name +"\nAuthor " + Arrays.toString(authors)+ "\nPublishing Year: " + publishingYear + "\nAmount of Pages: " + amountOfPages + "\nPrice " + price + "\nCover Type: " + CoverType + "]";
    }
    
}
