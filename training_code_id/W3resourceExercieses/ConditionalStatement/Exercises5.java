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
public class Exercises5 {
    /*5. Write a Java program that keeps a number from the user and generates 
         an integer between 1 and 7 and displays the name of the weekday */
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("input a number between 1-7 to represent a weekday: ");
        int num = input.nextInt();
        if(num == 1){
            System.out.println("Monday");
        }else if(num == 2){
            System.out.println("Tuesday");
        }else if(num == 3){
            System.out.println("Wednesday");
        }else if(num == 4){
            System.out.println("Thuesday");
        }else if(num == 5){
            System.out.println("Friday");
        }else if(num == 6){
            System.out.println("Saturday");
        }else if(num == 7){
            System.out.println("Sunday");
        }
        
    }
}
