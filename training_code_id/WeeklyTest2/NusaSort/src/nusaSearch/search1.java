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
/**
 *
 * @author Bagus
 */
public class search1 <linear> {
    private ArrayList<buku> listBuku;
    private boolean isSorted;
    private buku bk;
    public static void main(String[] argv) {

    search1<Integer> linear = new search1<Integer>();//to find int
    search1<String> linear1 = new search1<String>();//to find string

    ArrayList<Integer> alist = new ArrayList<Integer>();
    alist.add(1);
    alist.add(3);
    alist.add(5);
    alist.add(7);

    int num = 5;


    ArrayList<String> alist2 = new ArrayList<String>();
    alist2.add("A");
    alist2.add("B");
    alist2.add("C");
    alist2.add("D");

    String word = "C";


    System.out.println(linear.linearSearch(alist, num));

    System.out.println(linear1.linearSearch(alist2, word));


}

public int linearSearch(ArrayList<linear> rrr, linear wordnum) {
    for (int i=0; i < rrr.size(); i++) {
        if (wordnum.equals(rrr.get(i))) {
            return i;

        };
    };
    return -1;
}
public ArrayList<buku> getDataList(){
           listBuku = new ArrayList<buku>();
        try {
            PreparedStatement ps = nusasort.javaconnect.ConnectDb().prepareStatement("select*from newbook");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                buku   bk = new buku();
                bk.setBookId(rs.getInt("BookId"));
                bk.setBookName(rs.getString("Name"));
                bk.setBookPrice(rs.getInt("Price"));
                bk.setBookshelf(rs.getString("Bookshelf"));
                listBuku.add(bk);
            }

            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return listBuku;
    }
}

