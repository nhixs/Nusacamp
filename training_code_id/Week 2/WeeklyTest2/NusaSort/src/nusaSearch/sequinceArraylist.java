/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusaSearch;

import java.util.ArrayList;

/**
 *
 * @author Bagus
 */
public class sequinceArraylist {
    ArrayList al=new ArrayList();
            public void tambah(){  //method Untuk mengisi ArrayList
                        al.add("A");
                        al.add("B");
                        al.add("C");
                        al.add("D");
                        al.add("F");
                        al.add("G");
                        al.add("H");
                        al.add("I");
                        al.add("J");
                        al.add("K");
            }
             public void cetak()
{  // method untuk mengeluarkan isi dari ArrayList
            System.out.println("Isi Array :"+ al);
}
              public void cari(String golek)
{  //method implementasi Algoritma Sequential
            int n=0;
            boolean ketemu=false;

for(int i=n;i<al.size();i++)
{
            if (al.get(i) ==golek){
                        ketemu=true;
                        n=i;
                                                }
}

if (ketemu==true)
            {
            System.out.println("Data Ada Di Index Ke "+n);
            }
else
            {
            System.out.println("Data Tidak Ditemukan");
            }
}
 public static void main(String[] args)
{
            sequinceArraylist s=new sequinceArraylist();
            s.tambah(); //untuk mengisi ArrayList dengan Data
            s.cari("G");// untuk melakukan pencarian karakter A
}
}
