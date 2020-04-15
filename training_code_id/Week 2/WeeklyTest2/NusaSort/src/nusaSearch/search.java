/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusaSearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Bagus
 */
public class search {
    public static void main(String[] args)throws IOException
{
    int[] data={99,20,14,8,27,5,21,10,41,11};
int cari=41;
int i=0;
boolean ditemukan = false;
for(i=0;i<data.length;i++){
if(data[i]==cari){
ditemukan=true;
break;
}
}
if(ditemukan){
System.out.println("Data: "+cari+" Ditemukan Pada index: "+i+",");
}else{
System.out.println("Data Tidak Ditemukan");
}
    
} 
}
