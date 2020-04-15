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
public class Excercises2 {
   //2.Write a Java program that reads a number in inches, converts it to meters. Go to the editor
   //Note: One inch is 0.0254 meter. 
    
     public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       
       double inches,meter;
       
        System.out.println("Input Value of inches");
        inches = input.nextDouble();
        System.out.println("");
        meter = inches / 39.37; //Rumus dari Fahrenheit to celcious
        System.out.println(inches+" inch is equal to "+meter+" meter.");
       
       
       
    }
    
}
