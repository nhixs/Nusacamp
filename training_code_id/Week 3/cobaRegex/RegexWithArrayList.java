/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaRegex;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bagus
 */
public class RegexWithArrayList {
    private ArrayList<email> listEmail;
    public ArrayList<email> getEmailList(){
        listEmail = new ArrayList<email>();
        try{
           PreparedStatement pst = javaconnect.ConnectDb().prepareStatement("select * from nwstudent");//declare pemilihan table student di database library
           ResultSet rst = pst.executeQuery();// eksekusi query sql dari pst
           while(rst.next()){
               email mail = new email();
               mail.setemail(rst.getString("emailStudent"));//untuk ambil data dari kolom emailStudent
               listEmail.add(mail);
           }
           pst.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listEmail;
    }
     
    

}
