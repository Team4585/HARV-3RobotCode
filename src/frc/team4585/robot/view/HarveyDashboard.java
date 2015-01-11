package frc.team4585.robot.view;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team4585.robot.controller.RobotController;
import frc.team4585.robot.objects.Attack3;
import frc.team4585.robot.objects.Extreme3DPro;


/**
 *
 * @author Ivan Tachini (@Husky Robotics <Team 4585> )
 */
public class HarveyDashboard
{
	private final RobotDrive RobotChassis;

	private final Extreme3DPro Extreme3DPro;
	private final Attack3 Attack3;
	
	private final HarveyDashboard Dashboard;

	private static boolean isDebugModeOn;
	private static SendableChooser SelectDriveTeamProfile;

	public HarveyDashboard()
	{
		this.RobotChassis = RobotController.getRobotChassis();
		this.Extreme3DPro = RobotController.getExtreme3DPro();
		this.Attack3 = RobotController.getAttack3();
		
		this.Dashboard = RobotController.getDashboard();

		SelectDriveTeamProfile = new SendableChooser();
		SelectDriveTeamProfile.addDefault("Team A", "A");
		SelectDriveTeamProfile.addObject("Team B", "B");

		update();
	}

	public void update()
	{

		debugButton();
		getSelectedDriveTeam();
	}

	public void debugButton()
	{
		SmartDashboard.putData("< Toggle Debug Mode >", ToggleDebugMode());
		SmartDashboard.putBoolean("DEBUGMODE", isDebugModeOn);
	}

	public static String getSelectedDriveTeam()
	{
		String SelectedDriveTeam = "Team A";

		if (SelectDriveTeamProfile.getSelected() == "Team B")
		{
			SelectedDriveTeam = "Team B";
		}

		return SelectedDriveTeam;

	}

	public Sendable ToggleDebugMode()
	{
		isDebugModeOn = !isDebugModeOn;
		return null;
	}

	public static boolean getDebugMode()
	{
		return SmartDashboard.getBoolean("DEBUGMODE");
	}

}
