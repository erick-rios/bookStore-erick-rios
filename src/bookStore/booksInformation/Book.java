package bookStore.booksInformation;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;


public class Book {
    private int              id;
    private String         name;
    private Author[]     authors;
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
    public void setCoverType(CoverType CoverType){
        this.CoverType = CoverType;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Author[] getAuthors(){
        return this.authors;
    }
    public Publisher getPublisher(){
        return this.publisher;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public int getAmountOfPages(){
        return this.amountOfPages;
    }
    public BigDecimal getPrice(){
        return this.price;
    }
    public CoverType getCoverType(){
        return this.CoverType;
    }
    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null) return false;
        if(this.getClass() != object.getClass()) return false;
        Book anotherBook = (Book) object;
        return id == anotherBook.id && Objects.equals(name, anotherBook.name) 
               && Arrays.equals(authors, anotherBook.authors) && Objects.equals(publisher, anotherBook.publisher) 
               && amountOfPages == anotherBook.amountOfPages && Objects.equals(price, anotherBook.price) 
               && CoverType == anotherBook.CoverType;
    
    }

    public boolean hasAuthor(Author authorToSearch){
        for(Author author : authors){
            if(author.equals(authorToSearch)){
                return true;
            }
        }
        return false;

    }

    @Override
    public String toString(){
        return "[Id: "+ id+ "\nName: "+ name +"\nAuthor " + Arrays.toString(authors)+ "\nPublishing Year: " + publishingYear + "\nAmount of Pages: " + amountOfPages + "\nPrice " + price + "\nCover Type: " + CoverType + "]";
    }
    
}
