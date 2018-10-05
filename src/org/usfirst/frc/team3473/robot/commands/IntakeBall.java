package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeBall extends Command {

    public IntakeBall() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.shooter.setServoAngle(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(OI.intakeButton.get()) {
    		
    		Robot.shooter.setShooterAngle(-0.5);
    		Robot.intake.setIntakeSpeed(0.75);
    		Robot.shooter.setIntakeSpeed(0.5);

    	}
    	
    	if(OI.outtakeButton.get()) {
    		Robot.shooter.setShooterAngle(-0.5);
        	Robot.intake.setIntakeSpeed(-0.75);
        	Robot.shooter.setIntakeSpeed(-0.5);

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
