/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3resourceExercieses.Array;
import java.util.Arrays;
/**
 *
 * @author Bagus
 */
public class Exercises45 {
    //45. Write a Java program to cyclically rotate a given array clockwise by one
    static char arr[] = new char[]{'A','B','C','D','E'};
    
    static void rotate(){
        char x = arr[arr.length-1];
        int i;
        for(i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
            arr[0] = x;
        }
    }
    public static void main(String[]args){
        System.out.println("Given array is: ");
        System.out.print(Arrays.toString(arr));
        rotate();
        System.out.println("");
        System.out.println("Rotated array");
        System.out.print(Arrays.toString(arr));
    }
}
