/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagus
 */
import java.util.Scanner;
public class Profile {
    public void caleg(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama: ");
        String nama = input.nextLine();
        System.out.println("Masukan nomer urut: ");
        String urut = input.nextLine();
        System.out.println("Masukan Dapil: ");
        String dapil = input.nextLine();
        System.out.println("Masukan Nama Kelurga: ");
        String keluarga = input.nextLine();
        System.out.println("Nama Istri: ");
        String istri = input.nextLine();
        System.out.println("Nama Anak 1: ");
        String anak1 = input.nextLine();
        System.out.println("Nama Anak 2: ");
        String anak2 = input.nextLine();
        System.out.println("Nama Anak 3: ");
        String anak3 = input.nextLine();
        
        System.out.println("Nama: "+nama);
        System.out.println("No. Urut: "+urut);
        System.out.println("Dapil: "+dapil);
        System.out.println("Keluarga: "+keluarga);
        System.out.println("Nama Istri: "+istri);
        System.out.println("Nma Anak1: "+anak1);
        System.out.println("Nama Anak2: "+anak2);    
        System.out.println("Nama Anak3: "+anak3); 
        
        
    }
     public void pekerjaan(){
         Scanner input = new Scanner(System.in);
        String hp,gen,dob,adr,wa,com,comphone,post,npwp;
        System.out.println("Masukan No.Hp: ");
        hp = input.nextLine(); 
         System.out.println("Masukan Gender: ");
         gen = input.nextLine();
         System.out.println("Masukan DOB: ");
         dob = input.nextLine();
        
         System.out.println("Masukan Address: ");
         adr = input.nextLine();
         System.out.println("Masukan Work Address: ");
         wa = input.nextLine();
         System.out.println("Masukan Company: ");
         com = input.nextLine();
         System.out.println("Masukan Company phone: ");
         comphone = input.nextLine();
         System.out.println("Masukan Position: ");
         post = input.nextLine();
         System.out.println("Masukan NPWP: ");
         npwp = input.nextLine();
         
         System.out.println("Hp: "+hp);
        System.out.println("Gender: "+gen);
        System.out.println("DOB: "+dob);
        System.out.println("Address: "+adr);
        System.out.println("Work Address: "+wa);
        System.out.println("Company: "+com);
        System.out.println("Company Phone: "+comphone);
        System.out.println("Position: "+post);
        System.out.println("NPWP: "+npwp); 
        
        


    }
    
    
}

