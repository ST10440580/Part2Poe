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
public class Register {
    public String firstName;
    public String lastName;
    public  String username;
    public String password;
   
    
    public  boolean registrationMethod() {
       //Enables user to input data
       JOptionPane.showMessageDialog(null, "Welcome to the Kanbanapp.Please register to proceed");
       firstName = JOptionPane.showInputDialog(null,"Enter name");
         lastName = JOptionPane.showInputDialog(null,"Enter lastname");
         username = JOptionPane.showInputDialog(null,"Enter username");
          boolean usernameValid = checkUserName(username);
         while(!usernameValid) {
               JOptionPane.showMessageDialog(null,"Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in");
            return usernameValid;
         } 
               {JOptionPane.showMessageDialog(null,"Username successfully captured");
           
               
      password = JOptionPane.showInputDialog(null,"Enter new password");
      boolean passwordValid = checkPasswordComplexity(password);

       while(passwordValid) 
            JOptionPane.showMessageDialog(null,"Password is not correctly formatted,please ensure that password contains at ,east 8 characters,a capital letter ");
        
       

        

}

    
        return false ;
       }
//Sets the condition that a username must follow
      
   public  boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    //Sets the condition that a password must follow
    public  boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".[A-Z].") &&
               password.matches(".[0-9].") &&
               password.matches(".[!@#$%^&()_+].*");
    

    }
    
}