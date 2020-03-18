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
    
   public ArrayList<buku> doSelectionSort(ArrayList<buku> obj, String key) {
        buku books = new buku();
        listBuku = obj;
        
        if (key.equalsIgnoreCase("BookId")){
            for (int i = 0; i < listBuku.size(); i++) {
                int min = listBuku.get(i).getBookId();
                int minIndex = 1;

                for (int j = i + 1; j < listBuku.size(); j++) {
                    if (listBuku.get(j).getBookId() < min) {
                        min = listBuku.get(j).getBookId();
                    }
                }
                if (i != minIndex) {
                    Collections.swap(listBuku, i, minIndex);
                }
            }
        } else if (key.equalsIgnoreCase("Name")) {
            for (int i = 0; i < listBuku.size(); i++) {
                String tempName = listBuku.get(i).getBookName();
                int minIndex = 1;

                for (int j = i + 1; j < listBuku.size(); j++) {
                    if (listBuku.get(j).getBookName().compareToIgnoreCase(tempName)>0) {
                        tempName = listBuku.get(j).getBookName();
                    }
                }
                if (i != minIndex) {
                    Collections.swap(listBuku, i, minIndex);
                }
            }
        } else if (key.equalsIgnoreCase("Price")) {
            for (int i = 0; i < listBuku.size(); i++) {
                int tempPrice = listBuku.get(i).getBookPrice();
                int minIndex = 1;

                for (int j = i + 1; j < listBuku.size(); j++) {
                    if (listBuku.get(j).getBookPrice() < tempPrice) {
                        tempPrice = listBuku.get(j).getBookPrice();
                    }
                }
                if (i != minIndex) {
                    Collections.swap(listBuku, i, minIndex);
                }
            }
        } else if (key.equalsIgnoreCase("Bookshelf")) {
            for (int i = 0; i < listBuku.size(); i++) {
                String tempBookshelf = listBuku.get(i).getBookshelf();
                int minIndex = 1;

                for (int j = i + 1; j < listBuku.size(); j++) {
                    if (listBuku.get(j).getBookshelf().compareToIgnoreCase(tempBookshelf)>0) {
                        tempBookshelf = listBuku.get(j).getBookshelf();
                    }
                }
                if (i != minIndex) {
                    Collections.swap(listBuku, i, minIndex);
                }
            }
        }
        
        
        return listBuku;
    }

    
     public ArrayList<buku> doBubbleSort(ArrayList<buku> obj, String key) {

        listBuku = obj;
        buku temp = null;
        
        
        //doBubbleSort
        if (listBuku.size() > 1) {
            for (int x = 0; x < listBuku.size(); x++) {
                isSorted = true;
                for (int i = 0; i < (listBuku.size() - x - 1); i++) {

                    if (key.equalsIgnoreCase("BookId")) {
                        if ((listBuku.get(i).getBookId()) > (listBuku.get(i + 1).getBookId())) {
                            temp = (listBuku.get(i));
                            listBuku.set(i, listBuku.get(i + 1));
                            listBuku.set(i + 1, temp);
                        }
                        } else if (key.equalsIgnoreCase("Name")) {
                        if ((listBuku.get(i).getBookName()).compareToIgnoreCase(listBuku.get(i + 1).getBookName()) > 0) {
                            temp = (listBuku.get(i));
                            listBuku.set(i, listBuku.get(i + 1));
                            listBuku.set(i + 1, temp);
                        }
                         } else if (key.equalsIgnoreCase("Price")) {
                        if ((listBuku.get(i).getBookPrice()) > (listBuku.get(i + 1).getBookPrice())) {
                            temp = (listBuku.get(i));
                            listBuku.set(i, listBuku.get(i + 1));
                            listBuku.set(i + 1, temp);
                        }
                        } else if (key.equalsIgnoreCase("Bookshelf")) {
                        if ((listBuku.get(i).getBookshelf()).compareToIgnoreCase(listBuku.get(i + 1).getBookshelf()) > 0) {
                            temp = (listBuku.get(i));
                            listBuku.set(i, listBuku.get(i + 1));
                            listBuku.set(i + 1, temp);
                        }
                    }

               }
            }
        }
        return listBuku;
     }

     public ArrayList<buku> doInsertionSort(ArrayList<buku> obj, String key) {

        listBuku = getDataList();
        buku now;
        int i, j;

        if (key.equalsIgnoreCase("BookId")) {
            // with int id
            for (i = 1; i < listBuku.size(); i++) {
                now = new buku();
                now.setBookName(listBuku.get(i).getBookName());
                now.setBookId(listBuku.get(i).getBookId());
                now.setBookPrice(listBuku.get(i).getBookPrice());
                now.setBookshelf(listBuku.get(i).getBookshelf());
                j = i;
                while ((j > 0) && (listBuku.get(j - 1).getBookId() > now.getBookId())) {
                    listBuku.set(i, listBuku.get(j - 1));
                    i--;
                }
                listBuku.set(j, now);
            }

        } else if (key.equalsIgnoreCase("name")) {
            // with string nama
            for (i = 1; i < listBuku.size(); i++) {
                String curentName;
                now = new buku();
                now.setBookName(listBuku.get(i).getBookName());
                now.setBookId(listBuku.get(i).getBookId());
                now.setBookPrice(listBuku.get(i).getBookPrice());
                now.setBookshelf(listBuku.get(i).getBookshelf());
                curentName = now.getBookName();
                j = i - 1;
                while ((j >= 0) && (curentName.compareToIgnoreCase(listBuku.get(j).getBookName()) < 0)) {
                    listBuku.set(j + 1, listBuku.get(j));
                    j--;
                }
                listBuku.set(j + 1, now);
            }
        } else if (key.equalsIgnoreCase("Price")) {
            // with int nik
            for (i = 1; i < listBuku.size(); i++) {
                now = new buku();
                now.setBookName(listBuku.get(i).getBookName());
                now.setBookId(listBuku.get(i).getBookId());
                now.setBookPrice(listBuku.get(i).getBookPrice());
                now.setBookshelf(listBuku.get(i).getBookshelf());
                j = i;
                while ((j > 0) && (listBuku.get(j - 1).getBookPrice() > now.getBookPrice())) {
                    listBuku.set(i, listBuku.get(j - 1));
                    i--;
                }
                listBuku.set(j, now);
            }
        } else if (key.equalsIgnoreCase("Bookshelf")) {
            // with string username
            for (i = 1; i < listBuku.size(); i++) {
                
                String curBookshelf;
                now = new buku();
                now.setBookName(listBuku.get(i).getBookName());
                now.setBookId(listBuku.get(i).getBookId());
                now.setBookPrice(listBuku.get(i).getBookPrice());
                now.setBookshelf(listBuku.get(i).getBookshelf());
                curBookshelf = now.getBookshelf();

                j = i - 1;
                while ((j >= 0) && (curBookshelf.compareToIgnoreCase(listBuku.get(j).getBookshelf()) < 0)) {
                    listBuku.set(j + 1, listBuku.get(j));
                    j--;
                }
                listBuku.set(j + 1, now);
            }

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
     // MERGE SORT (cc: https://www.codexpedia.com/java/java-merge-sort-implementation/)
    public ArrayList<buku> doMergeSort(ArrayList<buku> whole) {
        //List Books is / = whole;
        ArrayList<buku> Left = new ArrayList<buku>();
        ArrayList<buku> Right = new ArrayList<buku>();
        int center;
 
        if (whole.size() == 1) {    
            return whole;
        } else {
            center = whole.size()/2;
            // copy the left half of whole into the left.
            for (int i=0; i<center; i++) {
                    Left.add(whole.get(i));
            }
 
            //copy the right half of whole into the new arraylist.
            for (int i=center; i<whole.size(); i++) {
                    Right.add(whole.get(i));
            }
 
            // Sort the left and right halves of the arraylist.
            Left  = doMergeSort(Left);
            Right = doMergeSort(Right);
 
            // Merge the results back together.
            merge(Left, Right, whole);
        }
        return whole;
    }
 
    private void merge(ArrayList<buku> Left, ArrayList<buku> Right, ArrayList<buku> whole) {
        //listNasabah = whole;
        int LeftIndex = 0;
        int RightIndex = 0;
        int wholeIndex = 0;
 
        // As long as neither the left nor the right ArrayList has
        // been used up, keep taking the smaller of left.get(leftIndex)
        // or right.get(rightIndex) and adding it at both.get(bothIndex).
        while (LeftIndex < Left.size() && RightIndex < Right.size()) {
            if ( (Left.get(LeftIndex).getBookName().compareTo(Right.get(RightIndex).getBookName())) < 0) {
                whole.set(wholeIndex, Left.get(LeftIndex));
                LeftIndex++;
            } else {
                whole.set(wholeIndex, Right.get(RightIndex));
                RightIndex++;
            }
            wholeIndex++;
        }
 
        ArrayList<buku> rest;
        int restIndex;
        if (LeftIndex >= Left.size()) {
            // The left ArrayList has been use up...
            rest = Right;
            restIndex = RightIndex;
        } else {
            // The right ArrayList has been used up...
            rest = Left;
            restIndex = LeftIndex;
        }
 
        // Copy the rest of whichever ArrayList (left or right) was not used up.
        for (int i=restIndex; i<rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }
}


