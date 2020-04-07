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
public class Exercises7 {
    //Write a Java program to find the number of days in a month.
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to find numbers of day in a month: ");
        int num = input.nextInt();
        String month = null;
        int numberOfDays = 0;
        System.out.println("What Years ? ");
        int years = input.nextInt();
        switch(num){
            case 1 : 
                    month = "January";
                    numberOfDays = 31;
                    break;
            case 2 : 
                    month = "February";
                    if((years % 400 == 0)||(years % 4 == 0)&&(years/100 != 0))
                        /* jika tahun habis dibagi 400 atau 4 dan tahun
                        tidak habis dibagi 100 maka hari di bulan februari ada 29
                        
                        */
                    {numberOfDays = 29;}
                    else{
                        numberOfDays = 28;
                    }
                    break;
            case 3 : 
                    month = "March";
                    numberOfDays = 31;
                    break;
            case 4 : 
                    month = "April";
                    numberOfDays = 30;
                    break;
            case 5 : 
                    month = "May";
                    numberOfDays = 31;
                    break;
            case 6 : 
                    month = "June";
                    numberOfDays = 30;
                    break; 
            case 7 : 
                    month = "July";
                    numberOfDays = 31;
                    break;
            case 8 : 
                    month = "August";
                    numberOfDays = 31;
                    break;
            case 9 : 
                    month = "September";
                    numberOfDays = 30;
                    break;
            case 10 : 
                    month = "October";
                    numberOfDays = 31;
                    break;
            case 11 : 
                    month = "November";
                    numberOfDays = 30;
                    break;
            case 12 : 
                    month = "December";
                    numberOfDays = 31;
                    break;
        }
        System.out.println(month+" "+years+" Has a "+numberOfDays+" days");
    }
}
