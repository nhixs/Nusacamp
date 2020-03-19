/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusaSearch;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import nusaSearch.buku;

/**
 *
 * @author Bagus
 */
public class SequenceSearch {
    private  ArrayList<buku> listBuku;
    
    private nusasort.buku bk;
    public ArrayList<buku> getDataList(){
           listBuku = new ArrayList<buku>();
        try {
            PreparedStatement ps = nusasort.javaconnect.ConnectDb().prepareStatement("select * from newbook");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                buku   bk = new buku();
                bk.setBookName(rs.getString("Name"));
                bk.setBookId(rs.getInt("Book_ID"));
                bk.setBookPrice(rs.getInt("Price"));
                bk.setBookPublisher(rs.getString("Publisher"));
                listBuku.add(bk);
            }

            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return listBuku;
    }
    
     public void Search(String ItemSearch )
{  //method implementasi Algoritma Sequential
            int n=0;
            boolean ketemu=false;
System.out.println("Data Yang ditemukan: ");
System.out.println("====================================");           

for(int i=n;i<listBuku.size();i++)
{
            if (listBuku.get(i).getBookName().toUpperCase().toLowerCase().startsWith(ItemSearch)){
               System.out.println(listBuku.get(i).getBookId()
                       +" :"+listBuku.get(i).getBookName()
                       +" :"+listBuku.get(i).getBookPublisher()
                       +" :"+listBuku.get(i).getBookshelf()
                       +" :"+listBuku.get(i).getBookPrice());
                                                }
            else if(listBuku.get(i).getBookName().toUpperCase().toLowerCase().endsWith(ItemSearch)){
               System.out.println(listBuku.get(i).getBookId()
                       +" :"+listBuku.get(i).getBookName()
                       +" :"+listBuku.get(i).getBookPublisher()
                       +" :"+listBuku.get(i).getBookshelf()
                       +" :"+listBuku.get(i).getBookPrice());
        }
} 


}
      public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
           SequenceSearch s = new SequenceSearch();
           System.out.println("Masukan judul yang ingin dicari");
           String ItemSearch = input.nextLine(); // masukan judul yang ingin dicari
            s.getDataList();//untuk mengisi ArrayList dengan Data
           s.Search(ItemSearch);// untuk melakukan pencarian String ItemList
}
    
    
}




