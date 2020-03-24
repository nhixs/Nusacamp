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
public class bangun_ruang {
    public static void main(String[]args){
        balok persegi = new balok();
        System.out.println("=========Balok=========");
        System.out.println("Volume Balok: "+persegi.vol_balok());
        
        Tabung bung = new Tabung();
        System.out.println("=========Tabung=========");
        System.out.println("Volume Tabung: "+ bung.vol_tabung());
    }
    
}
