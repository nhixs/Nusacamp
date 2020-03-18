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
        ArrayList<buku> bubbleSort = new ArrayList<buku>();
        ArrayList<buku> insertSort = new ArrayList<buku>();
        ArrayList<buku> reverseSort = new ArrayList<buku>();
        
        
        System.out.println("================================");
        System.out.println("Selection Sort ascending by price");
        System.out.println("Name & Price");
        selectSort = nusaSort.doSelectionSort();
        for (int i=0; i<selectSort.size(); i++) {
            System.out.println(selectSort.get(i).getBookName()+": "+selectSort.get(i).getBookPrice());
        }
        
        System.out.println("================================");
        System.out.println("Bubblesort by Name");
        System.out.println("Name & Price");
        bubbleSort = nusaSort.doBubbleSort(true);
        for (int i=0;i<bubbleSort.size();i++){
            System.out.println(bubbleSort.get(i).getBookName()+": "+bubbleSort.get(i).getBookPrice());
        }
        
        System.out.println("================================");
        System.out.println("Insertion sort by Name");
        System.out.println("Name & Price");
        insertSort = nusaSort.DoInsertionSort();
        for (int i=0;i<insertSort.size();i++){
            System.out.println(insertSort.get(i).getBookName()+": "+insertSort.get(i).getBookPrice());
        }
        
        System.out.println("===============================");
        System.out.println("Reverse by Price");
        System.out.println("Name & Price");
        reverseSort = nusaSort.doReverseSort();
        for (int i=0; i<reverseSort.size(); i++) {
            System.out.println(reverseSort.get(i).getBookName()+": "+reverseSort.get(i).getBookPrice());
        }
    }
    
}
