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
public class Bangun_datar {
    public static void main(String[]args){
        persegi_panjang P_P = new persegi_panjang();
        lingkaran O = new lingkaran();
        int l_persegi_p,lingkaran;
        
        System.out.println("======= Persegi Panjang =======");
        l_persegi_p = P_P.panjang()*P_P.lebar();
        System.out.println("Luas Persegi Panjang: "+l_persegi_p);
        
        System.out.println("======= Lingkaran =======");
        lingkaran = (int) (O.phi()*O.jari2());
        System.out.println("Luas Lingkaran: "+lingkaran);
    }
}
