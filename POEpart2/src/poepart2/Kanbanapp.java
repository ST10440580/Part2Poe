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
public class Kanbanapp extends  Task{
     public Task[] tasks ; 
    public int  totalHours =0;

    public void runApplication() {
        
               
        
        
        JOptionPane.showMessageDialog(null,"Welcome to EasyKanban" );
        JOptionPane.showMessageDialog(null, "Which feauture would you like to access");
        
        
                
                
                   
                JOptionPane.showMessageDialog(null,"Choose from these choices \n1.  Add tasks \n2.Show report (Coming Soon)\n3. Quit");       
         
           
            
            String input = JOptionPane.showInputDialog("Enter option (1, 2, or 3):");
        
        // Convert the input to an integer
        int choice = Integer.parseInt(input);

        // Use a switch statement to handle the input
       switch(choice) {
            case 1:
                JOptionPane.showMessageDialog(null, "Add tasks");
                int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to enter?"));
        tasks = new Task[numTasks];

        for (int i = 0; i < numTasks; i++) {
             taskName = JOptionPane.showInputDialog("Enter Task Name:");
             taskDescription = JOptionPane.showInputDialog("Enter Task Description:");
            JOptionPane.showMessageDialog(null, "Successfully captured");
         developerDetails = JOptionPane.showInputDialog("Enter Developer Details:");
             taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours):"));
                  
            taskStatus = JOptionPane.showInputDialog(null,"Choose betweem(Type them out) \n1.To Do  \n2.Done \n3.Doing");
            int option = Integer.parseInt(taskStatus);
            
            switch(option){
              
                case 1:
                    taskStatus = ("To Do");
                    JOptionPane.showMessageDialog(null,"To Do selected");
                    break;
                    
                case 2 : 
                    taskStatus =("Done");
                    JOptionPane.showMessageDialog(null,"Done selected");
                    break;
                case 3:
                    
                    taskStatus=("Doing");
                    JOptionPane.showMessageDialog(null,"Doing selected");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null,"Invalid number entered");
                
                 return;
                       
                               
                   
            }
                    
                    
            
            JOptionPane.showMessageDialog(null, createTaskID());
            
            JOptionPane.showMessageDialog(null,printTaskDetails());
           
         
        }
             
        
        

        JOptionPane.showMessageDialog(null, "Total hours across all tasks: " + taskDuration);
    
                break;
                
            case 2:
                
                JOptionPane.showMessageDialog(null, "Show Report:Coming soon");
                ;
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Quit");
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter 1, 2, or 3.");
                    return;
        
        }
       }
    }

                    
         
                    //https://github.com/ST10440580/Part2Poe.git
       
       

        
        


           

        
        
 
            

           


    