
package frc.team4585.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *  All Code that is Work in Progress Gets Tested Here <br>
 *  @version v0.3 
 *  @since 10/27/2014 
 *  @author Ivan Tachini
 */
public class TestCode extends SimpleRobot
{
    //Declaration Section
    private RobotDrive RobotHarvey;
    
    
    //Constructor Section
    public TestCode()
    {
        //Initialization Section
        RobotHarvey = new RobotDrive(1,2,3,4);
        
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
     *  When the Robot Enters Test Mode, this method is called. <br>
     *  The while loop keeps updating the robot until the robot is no longer in Test Mode.
     */
    public void executeCode()
    {
     //while the Robot is in Test Mode && The robot is still enabled by the field
     //update indefinetly
       while(isTest() && isEnabled()) 
       {
           yourTestMethod();
       }
     
    }
    
    public void yourTestMethod()
    {
    //Example Test Method
    
    }
    
}
