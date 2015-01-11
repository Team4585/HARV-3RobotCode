/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frc.team4585.robot.objects;

import edu.wpi.first.wpilibj.Joystick;

/**
 *  Class for modifying Joystick Attack3 Settings <br>
 *  - Weapons Joystick
 * 
 * @author Ivan Tachini @HuskyRobotics <Team 4585>
 */
public class Attack3 {
    
    private final Joystick Attack3;
    
    /*
     *  Attack3 Joystick Axis:
     * ( Min | Center | Max)
     * (-1.0 >  0.0   > 1.0)
     */
        
    private double X;  //Forward/Back  | Pitch
    private double Y;  //Left/Right    | Roll
    private double Z;  
    private double Twist;
    private double Throttle;
    
    public Attack3(int USBPORT)
    {
        Attack3 = new Joystick(USBPORT);
    }
    
    /**
     * Gets the X axis from the Joystick Attack3 <br>
     * Applies some sensitivity for Drive team, then returns the value
     * @return Modified X Value
     */
    public double getX()
    {
        X = Attack3.getX();
        //Sensitivity Code goes here
        return X;
    }

    /**
     * Gets the Y axis from the Joystick Attack3 <br>
     * Applies some sensitivity for Drive team, then returns the value
     * @return Modified Y Value
     */
    public double getY() 
    {
        Y = Attack3.getY();
        //Sensitivity Code goes here
        return Y;
    }

    
    /**
     * Gets the Z axis from the Joystick Attack3 <br>
     * Applies some sensitivity for Drive team, then returns the value
     * @return Modified Z Value
     */
    public double getZ() 
    {
        Z = Attack3.getZ();
        //Sensitivity Code goes here
        return Z;
    }

   
    /**
     * Gets the Twist axis from the Joystick Attack3 <br>
     * Applies some sensitivity for Drive team, then returns the value
     * @return Modified Twist Value
     */
    public double getTwist() 
    {
        Twist = Attack3.getTwist();
        //Sensitivity Code goes here
        return Twist;
    }

    /**
     * Gets the Throttle axis from the Joystick Extreme3DPro <br>
     * Applies some sensitivity for Drive team, then returns the value
     * @return Modified Throttle Value
     */
    public double getThrottle()
    {
        Throttle = Attack3.getThrottle();
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
        return Attack3.getRawButton(Button);
    }

    
    
    
    

   
    
    
            
   
    
}
