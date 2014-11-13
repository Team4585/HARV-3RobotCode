
package frc.team4585.robot.models;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import frc.team4585.robot.controller.RobotController;


/**
 *  All Code that is Work in Progress Gets Tested Here <br>
 *  @version v0.3 
 *  @since 10/27/2014 
 *  @author Ivan Tachini (@Husky Robotics <Team 4585> )
 */
public class Test 
{
    //Declaration Section
   private final RobotDrive RobotHarvey;
   private Joystick Extreme3DPro;
    
    
    //Constructor Section
    public Test()
    {
        RobotHarvey = RobotController.getRobotChassis();
    }
   
    /**
     * Calls Test Methods
     * <br>
     */
    public void executeCode()
    {
       yourTestMethod();
          
    }
    
    public void yourTestMethod()
    {
        //Example Test Method
    
    }
    
}
