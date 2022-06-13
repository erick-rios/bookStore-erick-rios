package bookStore.store;

import bookStore.booksInformation.*;
import java.util.Arrays;
import java.util.Objects;

public class BookService {

    public BookService(){};
    
    public Book[] filterBooksByAuthor(Author author, Book[] books){
        if(author == null || books == null) return new Book[0];
        
        int matchBooks = 0;
        for(Book book : books){
            if(book.hasAuthor(author)) matchBooks++;
        }
        Book[] filterBooks = new Book[matchBooks];
        int index = 0;
        for(Book book : books){
            if(book.hasAuthor(author)) filterBooks[index++] = book; 
        }
        return filterBooks;
    } 
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books){
        if(yearFromInclusively <=0 || books == null) return new Book[0];
        
        int matchBooks = 0;
        for(Book book : books){
            if(book.getPublishingYear() >= yearFromInclusively) matchBooks++;
        }
        Book[] filterBooks = new Book[matchBooks];
        int index = 0;
        for(Book book : books){
            if(book.getPublishingYear()>= yearFromInclusively) filterBooks[index++] = book; 
        }
        return filterBooks;
    }
    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books){
        if(publisher == null || books == null) return new Book[0];
        int matchBooks = 0;
        for(Book book : books){
            if(book.getPublisher().equals(publisher)) matchBooks++;
        }
        Book[] filterBooks = new Book[matchBooks];
        int index = 0;
        for(Book book : books){
            if(book.getPublisher().equals(publisher)){
                filterBooks[index++] = book;
            }
        }
        return filterBooks; 
    }
}
