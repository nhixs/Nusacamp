/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusaSearch;

import nusasort.*;

/**
 *
 * @author Bagus
 */
public class buku {
     
    private int BookId;
    private String BookName;
    private String BookPublisher;
    private int BookPrice;
    private String Bookshelf;
 
    public int getBookId() {
        return BookId;
    }
 
    public void setBookId(int BookId) {
        this.BookId = BookId;
    }
 
    public String getBookName() {
        return BookName;
    }
 
    public void setBookName(String BookName) {
        this.BookName = BookName;
    }
 
    public String getBookPublisher() {
        return BookPublisher;
    }
 
    public void setBookPublisher(String BookPublisher) {
        this.BookPublisher = BookPublisher;
    }
    public int getBookPrice() {
        return BookPrice;
    }
 
    public void setBookPrice(int BookPrice) {
        this.BookPrice = BookPrice;
    }
    public String getBookshelf() {
        return Bookshelf;
    }
 
    public void setBookshelf(String Bookshelf) {
        this.Bookshelf = Bookshelf;
    }

   
}

