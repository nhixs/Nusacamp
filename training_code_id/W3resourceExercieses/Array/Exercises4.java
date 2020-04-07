/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3resourceExercieses.Array;

/**
 *
 * @author Bagus
 */
public class Exercises4 {
    //4. Write a Java program to calculate the average value of array elements.
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,};
        int avg = 0;
        int sum = 0;
        System.out.println("given array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            sum+=arr[i];
            avg = sum/arr.length;
        }
        System.out.println();
        System.out.println("Average of given array is: "+avg);
    }
}
