/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3resourceExercieses.ConditionalStatement;

import java.util.Scanner;

/**
 *
 * @author Bagus
 */
public class Exercises4 {
    //4. Write a Java program that reads a floating-point number 
    //and prints "zero" if the number is zero. Otherwise, print "positive" 
    //or "negative". Add "small" if the absolute value of the number is 
    //less than 1, or "large" if it exceeds 1,000,000
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        int num = input.nextInt();
        if(num == 0){
            System.out.println("Zero");
        }else if(num > 0 && num < 1000000){
            System.out.println("Positiver Number");
        }else if(num > 1000000){
            System.out.println(num+" Positive Number"+" Large");
        }
        else if(num < 0 && num < 1){
            System.out.println(num+"Small "+" Negatibe Number"); 
        }
    }
}
