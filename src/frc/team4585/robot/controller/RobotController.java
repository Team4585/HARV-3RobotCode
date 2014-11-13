
package frc.team4585.robot.controller;

import edu.wpi.first.wpilibj.Joystick;
import frc.team4585.robot.models.Test;
import frc.team4585.robot.models.Operator;
import frc.team4585.robot.models.Autonomous;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import frc.team4585.robot.view.HarveyDashboard;

/**
 * Overrides autonomous(), operatorControl(), and test() from SimpleRobot 
 * <br>
 * <br> Each method calls its Instantiated subclass method executeCode()       

 * 
 * @author Ivan Tachini
 * @version 0.3 
 * @since 11/11/2014
 */

public class RobotController extends SimpleRobot
{   
 
  //private final Class Instances |  Instance Name
    private final Autonomous      AutonomousCode;
    private final Operator        OperatorCode;
    private final Test            TestCode;
    private final HarveyDashboard Dashboard;
    
    private static Joystick        Extreme3DPro;
    private static Joystick        Attack3;    
    private static RobotDrive      RobotChassis;
    /**
     * Constructs Autonomous, Operator and Test
     */
    public RobotController()
    {   
       //InstanceName  = new InstanceOfClass(Arguments);
        RobotChassis   = new RobotDrive(1,2,3,4);
        
        Dashboard      = new HarveyDashboard();
        Extreme3DPro   = new Joystick(1);
        Attack3        = new Joystick(2);
        
        AutonomousCode = new Autonomous();
        OperatorCode   = new Operator();
        TestCode       = new Test();
       
    } 
     
     /**
      * Overrides Parent method autonomous() in SimpleRobot. <br>
      * <br>
      * This method runs while the field is in the autonomous period.<br> 
      * It is called once each time the robot enters autonomous mode<br> <br>
      * Updates the Dashboard and Calls executeCode() in Autonomous upon entering autonomous state        
      */ 
    public void autonomous()
    {
        while(isAutonomous() && isEnabled()) 
        {
            
         AutonomousCode.executeCode(); 
         Dashboard.update();
        }
    }
     
     /**
      * Overrides Parent method operatorControl() in SimpleRobot. <br>
      * <br>
      * This method runs while the field is in the tele-operated period.<br> 
      * It is called once each time the robot enters operatorControl mode<br>
      * Updates the Dashboard and Calls executeCode() in Operator upon entering operatorControl mode  <br> 
      */     
    public void operatorControl()
    {
       while(isOperatorControl() && isEnabled())
       {
        
         OperatorCode.executeCode();
         Dashboard.update();
       }
    }    
    
      /**
      * Overrides Parent method test() in SimpleRobot. <br>
      * <br>
      * This method runs while the robot is in test mode.<br> 
      * It is called once each time the robot enters test mode<br>
      * Updates the Dashboard and Calls executeCode() in Test upon entering test mode     
      */
    public void test()
    {
       while(isTest() && isEnabled()) 
       {
        TestCode.executeCode();
        Dashboard.update();
       }
    }
       
    public static RobotDrive getRobotChassis()
    {
        return RobotChassis;
    }
    
    public static Joystick getExtreme3DPro()
    {
        return Extreme3DPro;
    }
    
     public static Joystick getAttack3()
    {
        return Attack3;
    }
    
    
}
