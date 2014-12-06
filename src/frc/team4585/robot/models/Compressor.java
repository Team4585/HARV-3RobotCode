/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frc.team4585.robot.models;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 * @author Ivan Tachini (@Husky Robotics <Team 4585> )
 */
public class Compressor {
    
    private final Relay CompressorRelay;
    private final Solenoid Solenoid;
    private boolean isCompressorOn;
    
    /**
     * Constructor for Compressor <br>
     * Initializes CompressorRelay, Solenoid
     * 
     * @param RelayPort  port that the relay is connected to
     * @param SolenoidPort port that the solenoid is connected to
     */
    public Compressor(int RelayPort, int SolenoidPort)
    {
        CompressorRelay = new Relay(RelayPort);
        Solenoid = new Solenoid(SolenoidPort);
    }
    
    /**
     * Checks the pressure in the air tanks
     * @return total current pressure of the air tanks 
     */
    public double checkPressure()
    {
     // TODO Pressure code 
        return 0.0;
    }
    
    /**
     * turns the compressor on, toggles the Smart board variable isCompressorOn
     */
    public void start()
    {
        toggleCompressorBoolean();
        CompressorRelay.set(Relay.Value.kOn);
    }
    
    /**
     * Turns the compressor Off, toggles the SmartDashboard Variable isCompressorOn
     */
    public void stop()
    {
        toggleCompressorBoolean();
        CompressorRelay.set(Relay.Value.kOff);
    }
    
    /**
     * Toggles the boolean isCompressorOn
     */
    public void toggleCompressorBoolean()
    {
        isCompressorOn = !isCompressorOn;
    }
    
    /**
     * returns if the compressor is on or not
     * @return boolean True if on, False if off
     */
    public boolean isCompressorOn()
    {
        return isCompressorOn;
    }
    
    
}
