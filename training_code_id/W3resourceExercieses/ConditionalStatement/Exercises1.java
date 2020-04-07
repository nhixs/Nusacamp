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
public class Exercises1 {
    //1. Write a Java program to get a number from the user and print whether it is positive or negative.
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("input a number");
        int num = input.nextInt();
        
        if(num < 0){
            System.out.println(num+" is Negative number");
        }
        if(num > 0){
            System.out.println(num+" is Positive number");
        }
        
    }
}
