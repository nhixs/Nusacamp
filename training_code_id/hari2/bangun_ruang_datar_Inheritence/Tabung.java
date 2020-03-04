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
public class Tabung extends lingkaran {
    
    public int vol_tabung(){
        Scanner input = new Scanner(System.in);
        lingkaran vol = new lingkaran();
        System.out.println("Masukan Tinggi Tabung: ");
        int vol_tabung,tinggi = input.nextInt();
        
        vol_tabung = (int) (vol.phi()*vol.jari2()*tinggi);
        
        return vol_tabung;
    }
    
}
