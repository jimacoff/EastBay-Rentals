/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author moniq
 */
public class Book implements Serializable {
    private String isbn;
    private String title;
    private String author;
    private Date copyright;
    private int count;

    
    public Book(){;}

    public Book(String isbn, String title, String author, Date copyright, int count) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.copyright = copyright;
        this.count = count;
    }
    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the copyright
     */
    public Date getCopyright() {
        return copyright;
    }

    /**
     * @param copyright the copyright to set
     */
    public void setCopyright(Date copyright) {
        this.copyright = copyright;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
}
