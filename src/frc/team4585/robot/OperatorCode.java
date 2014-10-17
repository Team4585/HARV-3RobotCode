/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frc.team4585.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;

/**
 *
 * @author 
 */
public class OperatorCode extends SimpleRobot {
    
    //Declaration Section
    private final RobotDrive RobotHarvey;
  
    
    
    public OperatorCode()
    {
      //Initalization section
        RobotHarvey  = new RobotDrive(1,2,3,4);    
    }
    
   /**
    * Operator code goes here. <br>
    */ 
   public void executeCode()
   {
     //Loops indefinitely until one condition is false 
       while(isOperatorControl() && isEnabled())
       {
           //Do Whatever the Human Wants!
           //Call Your Methods here!
           
           
           RobotHarvey.tankDrive(0,0);// Remeber to update RobotHarvey at the end of any method/loop
       }       
   }
   
   
   
   
   
  
    
}
