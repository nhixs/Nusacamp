/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusaSearch;

/**
 *
 * @author Bagus
 */
public class BookforBin {
    private String BookTittle;
    private int BookId;
    
    public BookforBin(String BookTittle, int BookId){
        this.BookTittle = BookTittle;
        this.BookId = BookId;
    }
    
    public String getBookTittle(){
        return BookTittle;
    }
    public void setBookTittle(){
        this.BookTittle = BookTittle;
    }
    public void setBookId(){
        this.BookId = BookId;
    }
    public int getBookId(){
        return BookId;
    }
    
    @Override
    public String toString(){
        return "Person[BookTittle= "+BookTittle+", BookId="+BookId+"]";
    }
    
}
