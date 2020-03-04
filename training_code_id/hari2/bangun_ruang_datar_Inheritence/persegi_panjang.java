/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_code_id.hari2.bangun_ruang_datar_Inheritence;

/**
 *
 * @author Bagus
 */
import java.util.Scanner;
public class persegi_panjang {
    public int panjang(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Panjang Persegi");
        int panjang = input.nextInt();
        
        return panjang;
    }
    public int lebar(){
        System.out.println("Masukan Lebar Persegi");
        Scanner input = new Scanner(System.in);
        int lebar = input.nextInt();
        
        return lebar;
    }
    
}
