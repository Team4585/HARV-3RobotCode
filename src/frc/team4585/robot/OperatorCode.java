/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frc.team4585.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author 
 */
public class OperatorCode extends SimpleRobot 
{
    
    //Declaration Section
    private final RobotDrive RobotHarvey;
  
    
    /**
     * Initializes RobotHarvey
     */
    public OperatorCode()
    {
        //Initalization section
        RobotHarvey  = new RobotDrive(1,2,3,4);    
    }
    
      /**
     * Updates SmartDashboard With buttons and variables
     */
     public final void UpdateSmartDashboard()
    {  
       //TODO add SmartDashboard things 
    }
       
    /**
     * While in Debug mode Log Methods to the SmartDashboard
     * @param OperatorLog String to Log
     */    
    public void DebugLog(String OperatorLog)
    {
        if(RobotCode.getDebugMode())
        {
            SmartDashboard.putString(OperatorLog,OperatorLog);
        }        
    }
    
    /**
     * Called when robot enters operatorMode.
     */
   public void executeCode()
   {
       //While the robot is in operator mode and enabled, call your methods and code indefiniatly 
       while(isOperatorControl() && isEnabled())
       {
            //Call Your Methods here          
            yourMethod();           
       }       
   }
   
   public void yourMethod()
   {
       //your code goes here
       //after your code does something update RobotHarvey 
         RobotHarvey.tankDrive(0,0);
   }
  
    
}
