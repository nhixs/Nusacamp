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
public class lingkaran extends bangun_datar {
    int r;
    public lingkaran(int r){
        this.r=r;
    }
    @Override
    public float luas(){
        return (int) ((Math.PI*2)*this.r);
    }
    @Override
    public float keliling(){
        return (int) (Math.PI*(this.r*this.r));
    }
}
