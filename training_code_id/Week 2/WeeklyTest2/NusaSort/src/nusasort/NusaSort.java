/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusasort;
import java.util.ArrayList;
import nusasort.javaconnect;
import nusasort.buku;
import nusasort.NusaSort;
/**
 *
 * @author Bagus
 */
public class NusaSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Books nusaSort = new Books();
        
        ArrayList<buku> selectSort = new ArrayList<buku>();
        System.out.println("=========================");
        System.out.println("SelectionSort by Price");
        System.out.println("=========================");
        selectSort = nusaSort.doSelectionSort(nusaSort.getDataList(), "Price");
        for (int i=0; i<selectSort.size(); i++) {
            System.out.println(" "+selectSort.get(i).getBookPrice()+" "+selectSort.get(i).getBookName()
                    +" "+selectSort.get(i).getBookshelf()+" "+selectSort.get(i).getBookId());
        }
                    System.out.println("");

        
        ArrayList<buku> bubbleSort = new ArrayList<buku>();
        System.out.println("=========================");
        System.out.println("BubbleSort by BookShelf");
        System.out.println("=========================");
        bubbleSort = nusaSort.doBubbleSort(nusaSort.getDataList(), "Bookshelf");
        for (int i=0;i<bubbleSort.size();i++){
            System.out.println(" "+bubbleSort.get(i).getBookshelf()+" "+bubbleSort.get(i).getBookName()
                    +" "+bubbleSort.get(i).getBookPrice()+" "+bubbleSort.get(i).getBookId());
        }
                    System.out.println("");

        
        ArrayList<buku> insertSort = new ArrayList<buku>();
        System.out.println("=====================");
        System.out.println("InsertionSort by Name");
        System.out.println("=====================");
        insertSort = nusaSort.doInsertionSort(nusaSort.getDataList(), "name");
        for (int i=0;i<insertSort.size();i++){
           System.out.println(" "+insertSort.get(i).getBookName()+" "+insertSort.get(i).getBookPrice()
                    +" "+insertSort.get(i).getBookshelf()+" "+insertSort.get(i).getBookId());
        }
                    System.out.println("");
                    

        System.out.println("=====================");
        System.out.println("ReverseSort with descending BooksID");
        System.out.println("=====================");
        ArrayList<buku> ReverseSort = new ArrayList<buku>();
        ReverseSort = nusaSort.doReverseSort();
        for (int i=0; i<ReverseSort.size(); i++) {
            System.out.println(" "+ ReverseSort.get(i).getBookId()+" "+ ReverseSort.get(i).getBookName()
                    +" "+ ReverseSort.get(i).getBookPrice()+" "+ ReverseSort.get(i).getBookshelf());
        }
        System.out.println("");
        
        ArrayList<buku> MergeSort = new ArrayList<buku>();
        System.out.println("=====================");
        System.out.println("MergeSort sort by NAME");
        System.out.println("=====================");
        
        MergeSort = nusaSort.doMergeSort(nusaSort.getDataList());
        
        for (int i=0; i<MergeSort.size(); i++) {
            System.out.println(" "+MergeSort.get(i).getBookName()+" "+ MergeSort.get(i).getBookPrice()
                    +" "+ MergeSort.get(i).getBookshelf()+" "+ MergeSort.get(i).getBookId());
        }
    }
    
}
