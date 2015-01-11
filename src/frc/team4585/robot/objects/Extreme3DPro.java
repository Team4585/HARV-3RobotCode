/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frc.team4585.robot.objects;

import edu.wpi.first.wpilibj.Joystick;
import frc.team4585.robot.controller.RobotController;
import frc.team4585.robot.view.HarveyDashboard;

/**
 *  Class for modifying Joystick Extreme3DPro Sensitivity  <br>
 *  - Drive Joystick
 * 
 * @author Ivan Tachini @HuskyRobotics <Team 4585>
 */
public class Extreme3DPro {
    
    private final Joystick Extreme3DPro;
  
    
    /*
     *  Extreme3DPro Joystick Axis:
     * ( Min | Center | Max)
     * (-1.0 >  0.0   > 1.0)
     */
        
    private double X;  //Forward/Back  | Pitch
    private double Y;  //Left/Right    | Roll
    private double Z;  
    private double Twist;
    private double Throttle;
    
    
    public Extreme3DPro(int USBPORT)
    {
        Extreme3DPro = new Joystick(USBPORT);
    }
   
    /**
     * Gets the X axis from the Joystick Extreme3DPro <br>
     * Applies Sensitivity Profile, then returns the value
     * @return Modified X Value
     */
    public double getX()
    {
        X = Extreme3DPro.getX();
        //Sensitivity Code goes here
        return X;
    }

    /**
     * Gets the Y axis from the Joystick Extreme3DPro <br>
     * Applies some sensitivity for Drive team, then returns the value
     * @return Modified Y Value
     */
    public double getY() 
    {
        Y = Extreme3DPro.getY();
        //Sensitivity Code goes here
        return Y;
    }

    
    /**
     * Gets the Z axis from the Joystick Extreme3DPro <br>
     * Applies Sensitivity, then returns the value
     * @return Modified Z Value
     */
    public double getZ() 
    {
        Z = Extreme3DPro.getZ();
        //Sensitivity Code goes here
        return Z;
    }

   
    /**
     * Gets the Twist axis from the Joystick Extreme3DPro <br>
     * A Applies Sensitivity, then returns the value
     * @return Modified Twist Value
     */
    public double getTwist() 
    {
        Twist = Extreme3DPro.getTwist();
        //Sensitivity Code goes here
        return Twist;
    }

    /**
     * Gets the Throttle axis from the Joystick Extreme3DPro <br>
     * Applies Sensitivity, then returns the value
     * @return Modified Throttle Value
     */
    public double getThrottle()
    {
        Throttle = Extreme3DPro.getThrottle();
        //Sensitivity Code goes here
        return Throttle;
    }
    
    /**
     * Method to check if a button was pressed
     * @param Button Button that is being checked
     * @return False if not pressed, true if pressed
     */
    public boolean getButton(int Button)
    {
        return Extreme3DPro.getRawButton(Button);
    }

    
    
    
    

   
    
    
            
   
    
}
