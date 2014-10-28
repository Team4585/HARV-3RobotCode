
package frc.team4585.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Overrides autonomous(), operatorControl(), and test() from SimpleRobot 
 * <br>
 * <br> Each method calls its Instantiated subclass method executeCode()       
 * <br> Code has been structured this way for organization and team purposes   
 * <br><b>Ask Before Modifying Please</b>
 * 
 * @author Ivan Tachini
 * @version 0.3 
 * @since 10/27/2014
 */

public class RobotCode extends SimpleRobot
{   
 
  //private final Class Instances |  Instance Name
    private final AutonomousCode   AutonomousCode;
    private final OperatorCode     OperatorCode;
    private final TestCode         TestCode;
    private static boolean isDebugModeOn;
    
    /**
     * Instances AutonomousCode, OperatorCode and TestCode
     */
    public RobotCode()
    {   
       //InstanceName  = new InstanceOfClass(Arguments);
        AutonomousCode = new AutonomousCode();
        OperatorCode   = new OperatorCode();
        TestCode       = new TestCode();
        isDebugModeOn      = false; //Start disabled
        UpdateSmartDashboard();
       
    } 
     
     /**
      * Overrides Parent method autonomous() in SimpleRobot. <br>
      * <br>
      * This method runs while the field is in the autonomous period.<br> 
      * It is called once each time the robot enters autonomous mode<br>
      * <b> Calls executeCode() in AutonomousCode upon entering autonomous state  </b>     
      */ 
    public void autonomous()
    {
        AutonomousCode.executeCode(); 
    }
     
     /**
      * Overrides Parent method operatorControl() in SimpleRobot. <br>
      * <br>
      * This method runs while the field is in the tele-operated period.<br> 
      * It is called once each time the robot enters operatorControl mode<br>
      * <b> Calls executeCode() in OperatorCode upon entering operatorControl mode  </b>     
      */     
    public void operatorControl()
    {
        OperatorCode.executeCode();
    }    
    
      /**
      * Overrides Parent method test() in SimpleRobot. <br>
      * <br>
      * This method runs while the robot is in test mode.<br> 
      * It is called once each time the robot enters test mode<br>
      * <b> Calls executeCode() in TestCode upon entering test mode  </b>     
      */
    public void test()
    {
       TestCode.executeCode();
    }
    
    /**
     * Allows outside Classes to get isDebugModeOn
     * @return True/False isDebugModeOn
     */
    public static boolean getDebugMode()
    {
       return isDebugModeOn;
    }
    
    /**
     * Creates a Button that upon being pressed Toggles isDebugModeOn 
 to be true if false and vice versa
     * @return null
     */
    public Sendable ToggleDebugMode()
    {
        isDebugModeOn = !isDebugModeOn;       
        return null;
    }
    
    /**
    * Updates SmartDashboard with Values and Buttons
    */ 
    public final void UpdateSmartDashboard()  
    {
        if(!isDebugModeOn) //If False put button to turn on 
        {
          SmartDashboard.putData("Turn Debug Mode On",new RobotCode().ToggleDebugMode());
        }
        else           // If True put button to turn off
        { 
          SmartDashboard.putData("Turn Debug Mode Off",new RobotCode().ToggleDebugMode());
        }  
        
    
    }
            
    
    
            
    
    
}
