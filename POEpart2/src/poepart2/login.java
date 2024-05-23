/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart2;


import javax.swing.JOptionPane;
/**
 *
 * @author Windows 10
 */
public class login extends Register {
    public String username1;
public String password1;


@SuppressWarnings("empty-statement")
     public  void loginMethod() {
         
        //Ensures user to 
      

        // Assume these are the correct username and password
       

  
       //Enables programs to insert name,lastname,username and password
         
          
         username1 = JOptionPane.showInputDialog(null,"Enter username");
         while(username1.equals(username));
              
      password1 = JOptionPane.showInputDialog(null,"Enter existing password");
         if(!password1.equals(password))
            JOptionPane.showMessageDialog(null,"You have successfully logged in");
      
            else

JOptionPane.showMessageDialog(null,"Please insert correct password");
    
                    
      }

      

    public  boolean LoginUser(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    
    public  boolean returnLoginStatus(String password) {
        return password.length() >= 8 &&
               password.matches(".[A-Z].") &&
               password.matches(".[0-9].") &&
               password.matches(".[!@#$%^&()_+].*");
       
        //Successfully logged in
        
     // if (username.equals(username) && password.equals(password)) {
          //  JOptionPane.showMessageDialog(null,"Welcome back:"+firstName +"x" +lastName);
          //  JOptionPane.showMessageDialog(null, firstName );
          // JOptionPane.showMessageDialog(null,lastName);
           // JOptionPane.showMessageDialog(null,"It is great to see you" +firstName);//

             
      
            
    }
}
     
    
