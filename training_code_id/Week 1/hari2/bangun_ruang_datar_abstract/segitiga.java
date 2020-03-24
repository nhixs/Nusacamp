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
public class segitiga extends datar {
    private float alas,tinggi,sisi;
    public segitiga(int alas,int tinggi,int sisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    @Override
    float getLuas(){
        return (this.alas*this.tinggi)*1/2;
    }
    @Override
    float getKeliling(){
        return this.sisi+this.sisi+this.sisi;
    }
}
