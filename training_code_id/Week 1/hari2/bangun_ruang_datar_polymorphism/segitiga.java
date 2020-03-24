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
public class segitiga extends bangun_datar {
    int alas,tinggi;
    
    public segitiga(int alas,int tinggi){
        this.alas=alas;
        this.tinggi=tinggi;    
    }
    @Override
    public float luas(){
        return this.alas*this.tinggi;
    }
}
