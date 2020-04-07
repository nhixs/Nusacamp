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
public class Exercises13 {
    public static void main(String[]args){
        //13.Write a program in Java to display the cube of the number upto given an integer
    Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = input.nextInt(),cube;
        System.out.println("first number is: "+n);
        for(int i=1; i<=n; i++){
                cube = i*i*i;// untuk menampilkan bilangan kubik dari setiap perulangan
                System.out.println("Number is :"+i+" and cube of "+i+" is : "+cube);
            
        }
        
}
}
