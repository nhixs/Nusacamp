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
            

for(int i=n;i<listBuku.size();i++)
{
            if (listBuku.get(i).getBookName().toUpperCase().toLowerCase().startsWith(ItemSearch)){
                        ketemu=true;
                        String buku;
                        buku = listBuku.get(i).getBookName();
                        System.out.println(buku);
                                                }
           if(listBuku.get(i).getBookName().toUpperCase().toLowerCase().endsWith(ItemSearch)){
               ketemu=true;
                        String buku;
                        buku = listBuku.get(i).getBookName();
                        System.out.println(buku);
        }
} 

if (ketemu==true)
            {
            System.out.println("Data Ada Di Index Ke "+n);
            }
else
            {
            System.out.println("Data Tidak Ditemukan");
            }
}
      public static void main(String[] args)
{
           SequenceSearch s = new SequenceSearch();
           String ItemSearch = "va";
            s.getDataList();//untuk mengisi ArrayList dengan Data
           s.Search(ItemSearch);// untuk melakukan pencarian String ItemList
}
    
    
}




