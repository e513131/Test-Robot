/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3473.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	 
	public static WPI_TalonSRX topRight = new WPI_TalonSRX(0);
	public static WPI_TalonSRX middleRIght = new WPI_TalonSRX(1);
	public static WPI_TalonSRX backRight = new WPI_TalonSRX(2);
	public static WPI_TalonSRX topLeft = new WPI_TalonSRX(3);
	public static WPI_TalonSRX middleLeft = new WPI_TalonSRX(4);
	public static WPI_TalonSRX backLeft = new WPI_TalonSRX(5);
	
	public static WPI_TalonSRX shootingWheelsL = new WPI_TalonSRX(6);
	public static WPI_TalonSRX shootingWheelsR = new WPI_TalonSRX(7);

	public static WPI_TalonSRX intakeSpin = new WPI_TalonSRX(8);
		
	public static AnalogGyro gyro = new AnalogGyro(0);
	

}
