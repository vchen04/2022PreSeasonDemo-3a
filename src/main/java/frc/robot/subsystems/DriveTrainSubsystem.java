// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

/**
 * Represents the robot's drive train
 */
public class DriveTrainSubsystem extends SubsystemBase {

  /**
   * The motor on the left side of the robot.
   */
  private final PWMSparkMax m_leftMotor;

  /**
   * The motor on the right side of the robot.
   */
  private final PWMSparkMax m_rightMotor;

  /**
   * The DifferentialDrive object representing the drive train. The
   * DifferentialDrive class provides useful methods for controlling a
   * tank-drive robot.
   */
  private final DifferentialDrive m_robotDrive;

  /**
   * Creates a new DriveTrainSubsystem.
   */
  public DriveTrainSubsystem() {
    /*
     * Initialize the m_leftMotor and m_rightMotor variables.
     */
    m_leftMotor = new PWMSparkMax(Constants.kLeftDriveTrainMotor);
    m_rightMotor = new PWMSparkMax(Constants.kRightDriveTrainMotor);

    /*
     * Initialize the m_robotDrive variable with the motors m_leftMotor and
     * m_rightMotor.
     */
    m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);
  }

  /**
   * Drive the robot using tank drive. This means that the left and right side
   * motors of the robot d rive train are controlled using two joysticks.
   * 
   * @param left  the percent output to run the left motor at
   * @param right the percent output to run the right motor at
   */
  public void tankDrive(double left, double right) {
    /*
     * Use the provided tankDrive method from the DifferentialDrive class
     */
    m_robotDrive.tankDrive(left, right);
  }

  @Override
  public void periodic() {
    /*
     * This method will be called once per scheduler run
     */
  }

  @Override
  public void simulationPeriodic() {
    /*
     * This method will be called once per scheduler run during simulation
     */
  }
}
