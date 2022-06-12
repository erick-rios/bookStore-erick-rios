package bookStore.store;

import bookStore.booksInformation.*;
import java.util.Arrays;
import java.util.Objects;

public class BookService {
    
    public Book[] filterBooksByAuthors(Author author, Book[] books){
        if(author == null || books == null) return new Book[0];
        
        int matchBooks = 0;
        for(Books book : books){
            if(book.hasAuthor()) matchBooks++;
        }
        Book[] filterBooks = new Book[matchBooks];
        int index = 0;
        for(Book book : books){
            if(book.hasAuthor()) filterBooks[index++] = book; 
        }
        return filterBooks;
    } 
    public Book[] filterBooksAfterExpecifiedYear(int yearFromInclusively, Book[] books){
        if(yearFromInclusively <=0 || books == null) return new Book[0];
        
        int matchBooks = 0;
        for(Books book : books){
            if(book.getPublishingYear() >= yearFromInclusively) matchBooks++;
        }
        Book[] filterBooks = new Book[matchBooks];
        int index = 0;
        for(Book book : books){
            if(book.hasPublishingYear()) filterBooks[index++] = book; 
        }
        return filterBooks;
    }
}
