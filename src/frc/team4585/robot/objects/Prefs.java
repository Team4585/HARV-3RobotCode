package frc.team4585.robot.objects;

import edu.wpi.first.wpilibj.Preferences;
import frc.team4585.robot.view.HarveyDashboard;

public class Prefs
{

	// default values
	private double SenX = 1;
	private double SenY = 1;
	private double SenZ = 1;
	private double SenTwist    = 1;
	private double SenThrottle = 1;

	private Preferences Prefs;
	private String CurrentTeam;
	
	public void updatePrefs()
	{
		CurrentTeam = HarveyDashboard.getSelectedDriveTeam();
	}
	
	public double getSenX()
	{
		SenX = Prefs.getDouble(CurrentTeam+"X", SenX);
		return SenX;
	}

	public double getSenY()
	{
		SenY = Prefs.getDouble(CurrentTeam+" Y", SenY);
		return SenY;
	}

	public double getSenZ()
	{
		SenZ = Prefs.getDouble(CurrentTeam+" Z", SenZ);
		return SenZ;
	}

	public double getSenTwist()
	{
		SenTwist = Prefs.getDouble(CurrentTeam+" Twist", SenTwist);
		return SenTwist;
	}

	public double getSenThrottle()
	{
		SenThrottle = Prefs.getDouble(CurrentTeam+" Throttle", SenThrottle);
		return SenThrottle;
	}

}
