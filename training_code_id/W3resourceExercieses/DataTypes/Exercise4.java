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
public class Exercise4 {
    //4. Write a Java program to convert minutes into a number of years and days
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
        System.out.println("Input the number of minutes");
        int minutes = input.nextInt();
        double rumus = 60 * 24 * 356;
        long years =  (long) (minutes/rumus); // dilakukan metode casting supaya 
                                              //tipe data double dari rumus bisa diperlakukan sebagai tipe data long
        int days = (minutes/60/24)%365;
        
        System.out.println("minutes is "+years+" years "+days+" days");
    }
}
