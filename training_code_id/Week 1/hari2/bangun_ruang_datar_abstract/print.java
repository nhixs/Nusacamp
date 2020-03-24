/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_code_id.hari2.bangun_ruang_datar_abstract;

/**
 *
 * @author Bagus
 */
public class print {
    public static void main(String[]args){
        datar segitiga = new segitiga(4,5,6);
        datar lingkaran = new lingkaran(5);
        bentuk krucut = new krucut(8);
        
        System.out.println("Luas Segitiga: "+segitiga.getLuas());
        System.out.println("Keliling Segitiga: "+segitiga.getKeliling());
        System.out.println("Luas Lingkaran: "+lingkaran.getLuas());
        System.out.println("Keliling Lingkaran: "+lingkaran.getKeliling());
        System.out.println("Luas Kerucut: "+krucut.getLuas());
    }
}
