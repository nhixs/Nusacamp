/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaRegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Bagus
 */
public class loopEmail {
    
   
    public void loopemail(){
        RegexWithArrayList email = new RegexWithArrayList();
       
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
       
        for(int i = 0; i < email.getEmailList().size(); i++){
            Matcher matcher = pattern.matcher((CharSequence) email.getEmailList().get(i).getemail());
            System.out.println(email.getEmailList().get(i).getemail()+" : "+ matcher.matches());
        }     
        
}
    
    
}