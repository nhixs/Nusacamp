/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_code_id.hari2.bangun_ruang_datar_polymorphism;

/**
 *
 * @author Bagus
 */
public class print {
    public static void main(String[]args){
        
        bangun_datar print = new bangun_datar();
        segitiga segitiga = new segitiga(6,8);
        persegi persegi = new persegi(9);
        lingkaran lingkaran = new lingkaran(8);
        
        print.luas();
        
        System.out.println("Luas Segitiga: "+ segitiga.luas());
        System.out.println("Luas Persegi: "+ persegi.luas());
        System.out.println("Luas Lingkaran: "+lingkaran.luas());
        
        print.keliling();
        
        System.out.println("Keliling Persegi "+ persegi.keliling());
        System.out.println("Keliling Lingkaran "+ lingkaran.keliling());
    }
}
