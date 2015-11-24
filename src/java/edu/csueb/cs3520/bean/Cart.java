/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moniq
 */
public class Cart implements Serializable {
    private List<Book> books;
    
    public Cart() {
        books = new ArrayList<Book>();
    }
    
    public void addBook(Book book){
        this.books.add(book);
    }
    
    public boolean removeBook (String isbn){
        boolean found = false;
        Book book = null;
        for(Book b: books){
            if(b.getIsbn().equals(isbn)){
                found = true;
                book = b;
                break;
            }
        }
        if(found && book != null){
            books.remove(book);
        }
        return found;
    }
    
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
}
