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
public class lingkaran {
    public double phi(){
        double phi = 3.14;
        System.out.println(phi);
        return phi;
    }
    public int jari2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jari-jari: ");
        int jari2 = input.nextInt();
            jari2 = jari2*jari2;
            
            return jari2;
    }
}
