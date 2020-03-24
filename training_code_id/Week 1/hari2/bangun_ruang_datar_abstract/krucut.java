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
public class krucut extends bentuk {
    private float tinggi;
    lingkaran alas = new lingkaran(5);
    public krucut(int tinggi){
        this.tinggi = tinggi;
    }
    @Override
    float getLuas(){
        
        return (alas.getLuas()*tinggi)*1/3;
    }
    @Override
    float getKeliling(){
        
        return 0;
    }
}
