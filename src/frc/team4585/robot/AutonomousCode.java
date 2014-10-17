
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
        
      //RobotDrive(int frontLeftMotor, int rearLeftMotor, int frontRightMotor, int rearRightMotor)
        RobotHarvey = new RobotDrive(1,2,3,4);
    }
    
    /**
    * Autonomous code goes here. <br>
    */ 
    public void executeCode()
    {
      //While robot is in autonomous mode and enabled, run this loop indefinitely
        while(isAutonomous() && isEnabled()) 
        {
          //Do Autonomous things!
          //Call Autonomous Methods here!
            
           RobotHarvey.tankDrive(0,0); //remember to update RobotHarvey at end of loop 
        }
    }
    
    
    
}
