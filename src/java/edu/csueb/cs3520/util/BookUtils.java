/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;

import edu.csueb.cs3520.bean.Book;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author moniq
 */
public class BookUtils {
    public static List<Book> getBooks(){
        List<Book> inventory = new ArrayList<Book>();
        inventory.add(new Book("123", "Stuff", "John Doe", new Date(), 2));
        inventory.add(new Book("456", "Stuff and things", "Josh", new Date(), 5));
        inventory.add(new Book("78", "How things works", "Jake", new Date(), 6));
        inventory.add(new Book("9", "Nonsense", "Jhon", new Date(), 7));
        inventory.add(new Book("10", "Books are Dumb", "Jonny", new Date(), 8));
        inventory.add(new Book("11", "How to read", "Reid", new Date(), 9));
        inventory.add(new Book("12", "Stuffing the stuff", "Jane", new Date(), 10));
        inventory.add(new Book("13", "Midterm on Wednesday", "Dan", new Date(), 12));
   
        return inventory;
    }
    public static Book getBookByIsbn(String isbn){
        Book book = null;
        List<Book> books = getBooks();
        for (Book b: books) {
            if(b.getIsbn().equals(isbn)){
                book = b;
            }
            
        }
        return book;
    }
}
