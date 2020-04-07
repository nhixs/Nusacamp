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
public class Exercises1 {
    
    
int partition(int arr[], int low, int high) 

        /* fungsi ini untuk mengambil element terakhir di array sebagai pivot
        kemudian membandingkan element yang akan disort, elemt lebih yang
        lebih besar dari pivot diletakan di sebelah kanan, dan yang lebih kecil
        disebelah kiri
        */
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        }
// swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    }

void sort (int arr[], int low, int high){
    if(low < high){
        int pi = partition(arr, low, high);
        
        sort(arr, low, pi-1);
        sort(arr, pi+1, high);
    }
}

    static void printArray(int arr[]){
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[]args){
        int arr[] = {10,7,5,6,3,8,};
        int n = arr.length;
        System.out.println("Unsorted Array");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        Exercises1 obj = new Exercises1();
        obj.sort(arr, 0, n-1);
        
        System.out.println("Sortd Array: ");
        printArray(arr);
    }
}

