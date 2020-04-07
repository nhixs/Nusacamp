/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3resourceExercieses.DataTypes;
import java.util.Scanner;
/**
 *
 * @author Bagus
 */
public class Exercises3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input an Integger between 0 to 1000");
        
        int number = input.nextInt();
        int firstdigit,seconddigit,thirddigit,fourthdigit,remainNumber,sum; 
            firstdigit = number % 10; // petama integer dipisahkan nilai awalnya dengan meoduluskan nilainya 
            remainNumber = number / 10;// kemudian dibagi sisanya 10
            seconddigit = remainNumber % 10;// sisa integer awal diulangi prosesnya
            remainNumber = remainNumber / 10;
            thirddigit = remainNumber % 10;
            remainNumber = remainNumber / 10;
            fourthdigit = remainNumber % 10;
            sum = firstdigit + seconddigit + thirddigit + fourthdigit;
            
            System.out.println("The sum of all digit is :"+sum);
            
            
        
        
    }
}
