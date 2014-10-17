
package frc.team4585.robot;

import edu.wpi.first.wpilibj.SimpleRobot;

/**
 *  Overrides autonomous(), operatorControl(), and test() from SimpleRobot <br>
 * <br>
 *  Each method calls its Instantiated subclass method executeCode() <br>
 *  Code has been structured this way for organization and team purposes
 * 
 * @author Ivan Tachini
 * @version 0.3 
 * @since 10/15/2014
 */

public class RobotCode extends SimpleRobot
{   
 
  //private final  ObjectName
    private final AutonomousCode  AutonomousCode;
    private final OperatorCode    OperatorCode;
    private final TestCode        TestCode;
    
    /**
     * Initializes Objects AutonomousCode, OperatorCode and TestCode
     */
    public RobotCode()
    {   
       //ObjectName    = new InstanceOfClass(Arguments);
        AutonomousCode = new AutonomousCode();
        OperatorCode   = new OperatorCode();
        TestCode       = new TestCode();
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
    
    
            
    
    
}
