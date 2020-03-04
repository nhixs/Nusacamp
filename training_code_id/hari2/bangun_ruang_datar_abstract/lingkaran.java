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
public class lingkaran extends datar{
     float radius;
    public lingkaran(int r){
        this.radius = r;
    }
    @Override
    float getLuas(){
        return (float) (Math.PI*(this.radius*this.radius));
    }
    @Override
    float getKeliling(){
        return (float) (Math.PI*2*this.radius);
    }
}
