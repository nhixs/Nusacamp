/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagus
 */
import java.util.Scanner;
public class Person extends Profile {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Person 1");
      
        Person profil = new Person();
        System.out.println("Menampilkan profile Caleg: ");
        profil.caleg();
        profil.pekerjaan();
        
        
        
        
        
    }
    
}
