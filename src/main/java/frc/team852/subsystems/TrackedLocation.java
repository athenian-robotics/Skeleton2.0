package frc.team852.subsystems;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team852.Robot;
import edu.wpi.first.wpilibj.Encoder;
import frc.team852.lib.geometry.Location;
import frc.team852.lib.geometry.Rotation;
import frc.team852.lib.geometry.SpeedPose;

/**
 * This entire command is specifically written for TANK DRIVE
 * Track location with encoders
 */
public class TrackedLocation extends SpeedPose {
	
	TrackedLocation(Location l, Rotation r, double speed){
		super(l, r, speed);
		
	}
	
}
