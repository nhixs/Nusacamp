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
public class balok extends persegi_panjang {
    
    public int vol_balok(){
        Scanner input = new Scanner(System.in);
        persegi_panjang vol = new persegi_panjang();
        System.out.println("Masukan Tinggi Balok: ");
        int vol_balok,tinggi = input.nextInt();
        
        vol_balok = vol.panjang()*vol.lebar()*tinggi;
        
        return vol_balok;
    }
    
}
