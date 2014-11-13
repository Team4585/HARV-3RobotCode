/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frc.team4585.robot.models;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import frc.team4585.robot.controller.RobotController;

/**
 *
 * @author 
 */
public class Operator
{
    
    //Declaration Section
    private final RobotDrive RobotHarvey;
    private final Joystick Extreme3DPro;
    private final Joystick Attack3;
    
    /**
     * Initializes RobotHarvey
     */
    public Operator()
    {
        //Initalization section
        RobotHarvey  = RobotController.getRobotChassis();
        Extreme3DPro = RobotController.getExtreme3DPro();
        Attack3      = RobotController.getAttack3();
       
    }
    
    /**
     * Called when robot enters operator control.
     */
   public void executeCode()
   {
     //Call Your Methods here          
     yourMethod();           
             
   }
   
   public void yourMethod()
   {
       //Example Method
        if(Extreme3DPro.getRawButton(7))
           
        RobotHarvey.tankDrive(0,0);
   }
  
    
}
