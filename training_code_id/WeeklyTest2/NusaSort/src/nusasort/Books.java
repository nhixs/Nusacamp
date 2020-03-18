/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusasort;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import nusasort.buku;
import nusasort.javaconnect;
/**
 *
 * @author Bagus
 */
public class Books {
    private ArrayList<buku> listBuku;
    private boolean isSorted;
    private buku bk;
    
   
    public ArrayList<buku> getDataList(){
           listBuku = new ArrayList<buku>();
        try {
            PreparedStatement ps = javaconnect.ConnectDb().prepareStatement("select*from newbook");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                bk = new buku();
                bk.setBookId(rs.getInt("Book_ID"));
                bk.setBookName(rs.getString("Name"));
                bk.setBookPrice(rs.getInt("Price"));
                listBuku.add(bk);
            }

            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listBuku;
    }
    
    public ArrayList<buku> doSelectionSort() {
        buku BooksItem = new buku();
        listBuku = getDataList();
        for (int i=0; i<listBuku.size();i++){
            int min = listBuku.get(i).getBookPrice();
            int minIndex = 1;
            
            for (int j = i+1; j < listBuku.size(); j++) {
                if (listBuku.get(j).getBookPrice() < min) {
                    min = listBuku.get(j).getBookPrice();
                }
            }
            if (i != minIndex) {
                Collections.swap(listBuku, i, minIndex);
            }
        }
        return listBuku;
    }
    
     public ArrayList<buku> doBubbleSort(boolean ascending) {

        listBuku = getDataList();

        buku temp = null;
        // algo
        if (listBuku.size() > 1) {
            for (int x = 0; x < listBuku.size(); x++) {
                isSorted = true;
                for (int i = 0; i < (listBuku.size() - x - 1); i++) {

                    if ((listBuku.get(i).getBookName()).compareToIgnoreCase(listBuku.get(i+1).getBookName())> 0) {
                        temp = (listBuku.get(i));
                        listBuku.set(i, listBuku.get(i + 1));
                        listBuku.set(i + 1, temp);
                    }

                }

            }
        }

        return listBuku;
    }
     
     public ArrayList<buku> DoInsertionSort() {
        
        listBuku = getDataList();
        int i,j;
        
        for (i = 1; i < listBuku.size(); i++) {
            buku InsBuku = new buku();
            String curName;
            InsBuku.setBookName(listBuku.get(i).getBookName());
            InsBuku.setBookId(listBuku.get(i).getBookId());
            curName = InsBuku.getBookName();
            j = i - 1;
            while ((j >= 0) && (curName.compareToIgnoreCase(listBuku.get(j).getBookName()) < 0)) {
                listBuku.set(j+1, listBuku.get(j));
                j--;
            }
            listBuku.set(j+1, InsBuku);
        }
        
        
        return listBuku;
    }
     
     public ArrayList<buku> doReverseSort() {
        listBuku = getDataList();
        ArrayList<buku> reverseBookList = new ArrayList<buku>();
        // store arraylist as  reversed elements
        for (int i = listBuku.size() - 1; i>=0; i-- ) {
            //append the elements in reverse order
            reverseBookList.add(listBuku.get(i));
        }
        return reverseBookList;
    }
}


