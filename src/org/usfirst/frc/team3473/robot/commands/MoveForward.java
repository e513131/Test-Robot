package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveForward extends Command {

	private double startingTime;
	private double speed;
	private double time;
	
    public MoveForward(double speed, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.speed=speed;
    	this.time =time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	startingTime=System.currentTimeMillis();
    	Robot.drivetrain.setLeft(speed);
    	Robot.drivetrain.setRight(speed);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	double timeElapsed = System.currentTimeMillis()-startingTime;
    	if(timeElapsed < time) {
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
