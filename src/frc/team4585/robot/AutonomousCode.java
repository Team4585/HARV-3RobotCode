
package frc.team4585.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * All Autonomous Methods are located here <br>
 * 
 * @version v0.3 
 * @since 10/27/2014 
 * @author 
 */
public class AutonomousCode extends SimpleRobot 
{
    
    //Declaration Section
    private final RobotDrive RobotHarvey; 
   
    
    //Constructor Section
    public AutonomousCode()
    {
        //Initalization section
        RobotHarvey = new RobotDrive(1,2,3,4);   
        UpdateSmartDashboard();
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
     * @param AutonomousLog String to Log
     */    
    public void DebugLog(String AutonomousLog)
    {
        if(RobotCode.getDebugMode())
        {
            SmartDashboard.putString(AutonomousLog,AutonomousLog);
        }        
    }
    
    /**
     *  When the Robot Enters Autonomous, this method is called. <br>
     *  The while loop keeps updating the robot until the robot is no longer in Autonomous.
     */
    public void executeCode()
    {   
            DebugLog("While Loop In Autonomous.ExecuteCode() Started ");
          //While the robot is in autonomous mode and enabled call methods indefinitely
            while(isAutonomous() && isEnabled()) 
            {
                 DebugLog("Method 1 Start");
                 //Call Autonomous Methods here!
                 yourAutonomousMethod();
                 DebugLog("Method 1 End");
            }
           DebugLog("While Loop In Autonomous.ExecuteCode() Ended ");
       
       
    }
    
    public void yourAutonomousMethod()
    {
      //Do Autonomous Stuff!
      //after your method does something, update RobotHarvey!
      RobotHarvey.tankDrive(0,0);
    }
    
    
}
