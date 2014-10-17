
package frc.team4585.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;

/**
 *
 * @author AutonomousDevs , OperatorDevs
 */
public class TestCode extends SimpleRobot
{
    //Declaration Section
    private RobotDrive RobotHarvey;
    
    public TestCode()
    {
        //Initialization Section
        RobotHarvey = new RobotDrive(1,2,3,4);
        
    }
    
    
    public void executeCode()
    {
       while(isTest() && isEnabled()) 
       {
           //Test all the code here!
       }
     
    }
    
    
}
