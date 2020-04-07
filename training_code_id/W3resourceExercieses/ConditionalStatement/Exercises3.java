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
public class Exercises3 {
    // 3. Take three numbers from the user and print the greatest number
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
        System.out.println("input first number: ");
        int first = input.nextInt();
        System.out.println("input second number: ");
        int second = input.nextInt();
        System.out.println("input third number");
        int third = input.nextInt();
        
        if(first > second)
            if(first>third){
                System.out.println("first number is greater "+ first);
        }if(second > first)
            if(second>third){
                System.out.println("second number is greater "+ second);
        }if(third > second)
            if(third>first){
                System.out.println("third number is greater "+ third);
        }
        
}
}
