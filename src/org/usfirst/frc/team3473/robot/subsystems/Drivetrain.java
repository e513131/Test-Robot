package org.usfirst.frc.team3473.robot.subsystems;

import org.usfirst.frc.team3473.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setLeft(double speed) {
    	RobotMap.backLeft.set(speed);
    	RobotMap.topLeft.set(speed);
    	RobotMap.middleLeft.set(speed);
    }
    
    public void setRight(double speed) {
    	RobotMap.backRight.set(-speed);
    	RobotMap.topRight.set(-speed);
    	RobotMap.backRight.set(-speed);
    }
    
}

