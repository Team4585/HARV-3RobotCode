
package frc.team4585.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;


public class AutonomousCode extends SimpleRobot 
{
    
    //Declaration Section
    private final RobotDrive RobotHarvey;
    
    //Constructor Section
    public AutonomousCode()
    {
        //Initalization section
        RobotHarvey = new RobotDrive(1,2,3,4);
    }
    
    /**
     * 
     */
    public void executeCode()
    {
        //While the robot is in autonomous mode and enabled, call methods indefinitely
        while(isAutonomous() && isEnabled()) 
        {
            //Call Autonomous Methods here!
            yourMethod();
        }
    }
    
    public void yourMethod()
    {
      //Do Autonomous Stuff!
      //after your method does something update RobotHarvey!
      RobotHarvey.tankDrive(0,0);
    }
    
    
}
