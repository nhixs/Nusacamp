/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3resourceExercieses.Sorting;

/**
 *
 * @author Bagus
 */
public class Exercises2 {
    //2. Write a Java program to sort an array of given integers using the Bubble sorting Algorithm.
    void bubblesort(int[]arr){
        int i,j,temp=0;
        for(i=0; i<arr.length-1; i++){
            for(j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){ // jika array index j lebih kecil dari pada array index j+1, maka dilakukan swap
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        Exercises2 obj = new Exercises2();
        int arr[] ={1,6,3,2,7,9,0,4,5,8};
        
        System.out.println("Unsorted Array");
        obj.printArray(arr);
        System.out.println("");
        obj.bubblesort(arr);
        System.out.println("Sorted Array");
        obj.printArray(arr);
       
        
        
    }
}
