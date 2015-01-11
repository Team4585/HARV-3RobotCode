package frc.team4585.robot.controller;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SampleRobot;
import frc.team4585.robot.modes.Autonomous;
import frc.team4585.robot.modes.Operator;
import frc.team4585.robot.modes.Test;
import frc.team4585.robot.objects.*;
import frc.team4585.robot.view.HarveyDashboard;

/**
 * Overrides autonomous(), operatorControl(), and test() from SimpleRobot <br>
 * <br>
 * Each method calls its Instantiated subclass method executeCode()
 *
 * @author Ivan Tachini (@Husky Robotics <Team 4585> )
 * @version 0.4
 * @since 1/10/2015
 */
public class RobotController extends SampleRobot
{

	// private Class Instance | Instance Name
	private static RobotDrive RobotChassis;

	private Autonomous AutonomousClass;
	private Operator OperatorClass;
	private Test TestClass;

	private static HarveyDashboard Dashboard;

	private static Extreme3DPro Extreme3DPro;
	private static Attack3 Attack3;


	private static final int USBPORT1 = 1;
	private static final int USBPORT2 = 2;
	private static final int USBPORT3 = 3;


	public void robotInit()
	{
		// InstanceName = new InstanceOfClass(Arguments);
		RobotChassis = new RobotDrive(1, 2, 3, 4);

		// Inputs
		Extreme3DPro = new Extreme3DPro(USBPORT1);
		Attack3 = new Attack3(USBPORT2);

		// Outputs
		Dashboard = new HarveyDashboard();

		// Classes
		AutonomousClass = new Autonomous();
		OperatorClass = new Operator();
		TestClass = new Test();

	}

	/**
	 * Overrides Parent method autonomous() in SimpleRobot. <br>
	 * <br>
	 * This method runs while the field is in the autonomous period.<br>
	 * It is called once each time the robot enters autonomous mode<br>
	 * <br>
	 * Updates the Dashboard and Calls executeCode() in Autonomous upon entering
	 * autonomous state
	 */
	public void autonomous()
	{
		while (isOperatorControl() && isEnabled())
		{
			AutonomousClass.executeCode();
		}

	}

	/**
	 * Overrides Parent method operatorControl() in SimpleRobot. <br>
	 * <br>
	 * This method runs while the field is in the tele-operated period.<br>
	 * It is called once each time the robot enters operatorControl mode<br>
	 * Updates the Dashboard and Calls executeCode() in Operator upon entering
	 * operatorControl mode <br>
	 */
	public void operatorControl()
	{
		while (isOperatorControl() && isEnabled())
		{
			OperatorClass.executeCode();
		}
	}

	/**
	 * Overrides Parent method test() in SimpleRobot. <br>
	 * <br>
	 * This method runs while the robot is in test mode.<br>
	 * It is called once each time the robot enters test mode<br>
	 * Updates the Dashboard and Calls executeCode() in Test upon entering test
	 * mode
	 */
	public void test()
	{
		while (isTest() && isEnabled())
		{
			TestClass.executeCode();
		}
	}

	public static RobotDrive getRobotChassis()
	{
		return RobotChassis;
	}

	public static HarveyDashboard getDashboard()
	{
		return Dashboard;
	}

	public static Extreme3DPro getExtreme3DPro()
	{
		return Extreme3DPro;
	}

	public static Attack3 getAttack3()
	{
		return Attack3;
	}

	public static int getUSBPORT1()
	{
		return USBPORT1;
	}

	public static int getUSBPORT2()
	{
		return USBPORT2;
	}

	public static int getUSBPORT3()
	{
		return USBPORT3;
	}

}
