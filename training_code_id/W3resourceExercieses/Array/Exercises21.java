/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3resourceExercieses.Array;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Bagus
 */
public class Exercises21 {
    //21. Write a Java program to convert an ArrayList to an array.
    public static void main (String[] args) 
    { 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40); 
  
        Object[] objects = al.toArray(); 
  
        // Printing array of objects 
        for (Object obj : objects) 
            System.out.print(obj + " "); 
    } 
}
