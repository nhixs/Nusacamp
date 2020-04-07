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
public class Exercises11 {
    
    public static void main(String[]args){
    //11. Write a program in Java to display n terms of natural numbers and their sum
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = input.nextInt(),sum=0;
        System.out.println("first number is: "+n);
        for(int i=1; i<=n; i++){
            System.out.println(i);
            sum+=i;// untuk menjumlahkan setiap perulangan
        }
        System.out.println("first number is "+n+" sum of all number up to n is: "+sum);
    }
}
