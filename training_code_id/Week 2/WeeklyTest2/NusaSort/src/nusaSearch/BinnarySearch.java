/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusaSearch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Bagus
 */
public class BinnarySearch {
    public static void main(String[]args){
        Comparator <BookforBin> BookId = new Comparator<BookforBin>(){
            public int compare(BookforBin IdBook1, BookforBin IdBook2){
             int x1 = IdBook1.getBookId();
             int x2 = IdBook1.getBookId();
             if(x1>x2){
                 return 1;
             }else{
                 return -1;
             }
            } 
        };
        Comparator <BookforBin>BookComTittle = new Comparator<BookforBin>(){
            public int compare(BookforBin TittleBook1, BookforBin TittleBook2){
                String y1 = TittleBook1.getBookTittle();
                String y2 = TittleBook2.getBookTittle();
                return y1.compareTo(y2);
            }
        };
        
        Scanner input = new Scanner(System.in);
        ArrayList<BookforBin> bookTittle = new ArrayList<BookforBin>();
        int IdBook = 0 ;
        boolean foundIt = true;
        
        System.out.println("===== Please insert Book Tittle =====");
        System.out.println("=====================================");
        
        while(foundIt != false){
            System.out.println("Please Insert a Book Tittle");
            String tittleBook = input.nextLine();
            if(tittleBook.isEmpty()){
                foundIt = false;
                break;
            }
            System.out.println("Please Insert a Book Id");
        IdBook = input.nextInt();
        bookTittle.add(new BookforBin(tittleBook,IdBook));
        input.nextLine();
        }
        Collections.sort(bookTittle, BookComTittle);
        System.out.println("");
        
        System.out.println("#Printin all Books#");
        // for each loop untuk mencetak semua judul buku
        for(BookforBin u : bookTittle ){
            System.out.println("Book Tittle: "+u.getBookTittle()+": "
                    +"Books ID: "+u.getBookId());
            System.out.println("===== After Books Sorting =====");
            
            Collections.sort(bookTittle, BookComTittle);// method sort untuk sorting array judul buku
            for(BookforBin v : bookTittle){
                System.out.println("Book Tittle: "+v.getBookTittle()+": "
                    +"Books ID: "+v.getBookId());
            }
            System.out.println("");
            System.out.println("==== Search you Books Tittle by Books Id =====");
            
            boolean flag = false;
            int searchBook = 0;
            System.out.println("Please Insert your Books Id");
            searchBook = input.nextInt();
            
            // jika judul aray kosong , makan akn di cari bukunya
            if(!bookTittle.isEmpty()){
                for(BookforBin w : bookTittle){
                    if(w.getBookId() == searchBook){
                        flag = true;
                        System.out.println("Book Tittle: "+w.getBookTittle()+": "
                    +"Books ID: "+w.getBookId());
                    }
                }
                // flag is not true makan Buku yang dicari tidak ada
                if(flag == false){
                    System.out.println("Buku tida ada !! Buku tersebut tidak tersedia");
                    
                }else{
                    System.out.println("Kosong !");
                }
            }
        }
    }
    
}
