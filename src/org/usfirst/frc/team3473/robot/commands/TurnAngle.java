package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.Robot;
import org.usfirst.frc.team3473.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnAngle extends Command {
	private double speed;
	private double angle;
	private double currentAngle;
	
    public TurnAngle(double speed, double angle) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.speed=speed;
    	this.angle=angle;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(angle<0) {
    		Robot.drivetrain.setLeft(-speed);
    		Robot.drivetrain.setRight(speed);
    	}
    	else {
    		Robot.drivetrain.setLeft(speed);
    		Robot.drivetrain.setRight(-speed);
    		
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	currentAngle=RobotMap.gyro.getAngle();
    	if(Math.abs(currentAngle)<Math.abs(angle)) {
    		return false;
    	}
    	return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.setLeft(0);
    	Robot.drivetrain.setRight(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
