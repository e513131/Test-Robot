package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShootBall extends Command {
	double time;
	double startingTime;
    public ShootBall() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    
    public ShootBall(int time) {
    	this.time = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	startingTime = System.currentTimeMillis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double timeElaped = System.currentTimeMillis() - startingTime;
    	if(timeElaped < time) {
    		Robot.shooter.setShootSpeed(0.75);
    	}
    	else {
    		Robot.shooter.setServoAngle(170);
    		Robot.shooter.setShootSpeed(0.75);
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
