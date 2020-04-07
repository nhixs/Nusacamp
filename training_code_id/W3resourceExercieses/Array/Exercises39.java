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
public class Exercises39 {
    
     void leader(int arr[],int length){
        for(int i=0; i<length; i++){
            int j;
            for( j=i+1; j<length; i++){
              if(arr[i] <= arr[j]){
                  break;
              }  
              if(arr[j]==length){
                  System.out.println(arr[i]+" ");
              }
            }
            
            
        }
    }
    public static void main(String[]args){
        int arr[] = {10, 9, 14, 23, 15, 0, 9};
      int size = arr.length;
        for (int i = 0; i < size; i++) 
        {
            int j;
            for (j = i + 1; j < size; j++) 
            {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) 
                System.out.print(arr[i] + " ");
        }
    }
    
}
