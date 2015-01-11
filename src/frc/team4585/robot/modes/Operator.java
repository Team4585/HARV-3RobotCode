
package frc.team4585.robot.modes;

import edu.wpi.first.wpilibj.RobotDrive;
import frc.team4585.robot.controller.RobotController;
import frc.team4585.robot.objects.Attack3;
import frc.team4585.robot.objects.Extreme3DPro;
import frc.team4585.robot.view.HarveyDashboard;


/**
 *
 * @author Operator Team!
 */
public class Operator
{
    
    //Declaration Section
    private final RobotDrive RobotChassis;
    private final Extreme3DPro Extreme3DPro;
    private final Attack3 Attack3;
    private final HarveyDashboard Dashboard;
    
    private boolean DEBUGMODE = false;
    
    

    public Operator()
    {
        //Initalization section
        this.RobotChassis = RobotController.getRobotChassis();
        this.Extreme3DPro = RobotController.getExtreme3DPro();
        this.Attack3      = RobotController.getAttack3();
        this.Dashboard    = RobotController.getDashboard();
        
        
        
    }
    
    /**
     * loops while robot is in operator control.
     */
   public void executeCode()
   {
      //Call Your Methods here          
        exampleButtonPressedMethod();
      //Do stuff
        
      //Drive Robot
       RobotChassis.tankDrive(Extreme3DPro.getX(),Attack3.getX());
            
   }
   
   public void exampleButtonPressedMethod()
   {
       //Example Method
        if(Extreme3DPro.getButton(7))
           RobotChassis.tankDrive(0,0);
   }
  
   
   
    
}
