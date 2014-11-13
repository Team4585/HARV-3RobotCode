
package frc.team4585.robot.models;

import edu.wpi.first.wpilibj.RobotDrive;
import frc.team4585.robot.controller.RobotController;



/**
 * All Autonomous Methods are located here <br>
 * 
 * @version v0.3 
 * @since 10/27/2014 
 * @author 
 */
public class Autonomous 
{
    
    //Declaration Section
    private final RobotDrive RobotHarvey; 
    
    
    //Constructor Section
    public Autonomous()
    {
        //Initalization section
        RobotHarvey = RobotController.getRobotChassis();   
    }
    
   
    
    /**
     *  When the Robot Enters Autonomous, this method is called. <br>
  The while loop keeps updating the robot until the robot is no longer in Autonomous.
     */
    public void executeCode()
    {  
          //While the robot is in autonomous mode and enabled method is run indefinitely
            
                 //Call Autonomous Methods here!
                 yourAutonomousMethod();
    }
    
    public void yourAutonomousMethod()
    {
      //Do Autonomous Stuff!
      //after your method does something, update RobotHarvey!

    }
    
    
}
