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
public class Exercise1 {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       
       double Fahrenheit,Celcius;
       
        System.out.println("Input Fahrenheit temperatur");
        Fahrenheit = input.nextDouble();
        System.out.println("");
        Celcius = (Fahrenheit - 32)*5/9; //Rumus dari Fahrenheit to celcious
        System.out.println(Fahrenheit+" degree is equal to "+Celcius+" Celcious degree.");
       
       
       
    }
    
}
