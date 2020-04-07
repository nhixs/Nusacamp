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
public class Exercise8 {
    /*8. Write a Java program that takes the user to provide a single character
    from the alphabet. Print Vowel or Consonant, depending on the user input. 
    If the user input is not a letter (between a and z or A and Z), 
    or is a string of length > 1, print an error message.*/
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a character: ");
        String alphabet = input.next().toLowerCase();
        boolean upcase = alphabet.charAt(0) >= 65 && alphabet.charAt(0) <= 90; 
        /* untuk memcocokan huruf yang diiput sesuai dengan ascii A-Z*/
        boolean downcase = alphabet.charAt(0) >= 97 && alphabet.charAt(0) <= 122;
        /* untuk memcocokan huruf yang diiput sesuai dengan ascii a-z*/
        boolean vocal = alphabet.equals("a")||alphabet.equals("i")||alphabet.equals("i")
                ||alphabet.equals("u")||alphabet.equals("e")||alphabet.equals("o"); // untuk menampung huruf vocal
        if(alphabet.length() > 1){
            System.out.println("not a character");
        }else if(!(upcase||downcase)){
            System.out.println("not a character");
        }else if(vocal){
            System.out.println("is a vocal character");
        }else{
            System.out.println("is a consonan character");
        }
        }
    }

