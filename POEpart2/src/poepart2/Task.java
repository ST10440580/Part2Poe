/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart2;

/**
 *
 * @author Windows 10
 */
public class Task  {
    public static int taskCount=0;
    public String taskName;
    public int taskNumber;
    public String taskDescription;
    public String developerDetails;
    public int taskDuration;
    public String taskID;
    public String taskStatus;
   public String Options;
    public String id;
    public int  totalHours =0;
    

   public void Task() {
        this.taskName = taskName;
       this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
       this.developerDetails = developerDetails;
       this.taskDuration = taskDuration;
      this.taskStatus = taskStatus;
       this.taskID = createTaskID();
      
                for (int i = 0; i < taskCount+1; i++) {
                     
                    
                    
    }
   }
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    public String createTaskID() {
         id = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return id;
    }

    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails + "\nTask Number: " + taskCount + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + id + "\nDuration: " + taskDuration + " hours";
    }

    public int returnTotalHours() {
       
        return taskDuration;
       
        
        
            
        }
    }
    

