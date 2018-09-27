package org.usfirst.frc.team3473.robot.subsystems;

import org.usfirst.frc.team3473.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setShootSpeed(double speed) {
    	RobotMap.shootingWheelsL.set(speed);
    	RobotMap.shootingWheelsR.set(-speed);
    }
    
    public void setIntakeSpeed(double intakeSpeed) {
    	RobotMap.shootingWheelsL.set(-intakeSpeed);
    	RobotMap.shootingWheelsR.set(intakeSpeed);
    }
}

