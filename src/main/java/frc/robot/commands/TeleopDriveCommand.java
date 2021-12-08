// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveTrainSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * Command to drive the robot in teleoperated mode with tank drive using two
 * joysticks.
 */
public class TeleopDriveCommand extends CommandBase {
  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })

  /**
   * The drive train subsystem.
   */
  private final DriveTrainSubsystem m_driveTrain;

  /**
   * The left joystick which controls the left side drivetrain motors.
   */
  private final Joystick m_leftJoystick;

  /**
   * The right joystick which controls the right side drivetrain motors.
   */
  private final Joystick m_rightJoystick;

  /**
   * Creates a new TeleopDriveCommand.
   *
   * @param driveTrain    The drive train subsystem.
   * @param leftJoystick  the left joystick which controls the left side
   *                      drivetrain motors
   * @param rightJoystick the right joystick which controls the right side
   *                      drivetrain motors
   */
  public TeleopDriveCommand(DriveTrainSubsystem driveTrain, Joystick leftJoystick, Joystick rightJoystick) {
    /*
     * Initialize the m_driveTrain variable.
     */
    m_driveTrain = driveTrain;

    /*
     * Initilaize the m_leftJoystick and m_rightJoystick variables.
     */
    m_leftJoystick = leftJoystick;
    m_rightJoystick = rightJoystick;

    /*
     * Use addRequirements() here to declare subsystem dependencies.
     */
    addRequirements(driveTrain);
  }

  /**
   * Called when the command is initially scheduled.
   */
  @Override
  public void initialize() {
  }

  /**
   * Called every time the scheduler runs while the command is scheduled.
   */
  @Override
  public void execute() {
    /*
     * Drive the robot using the DriveTrainSubsystem's tankDrive method. We want
     * how much the joysticks are pushed forwards or backwards to determine the
     * speed the motors run at, so we pass in the arguments
     * m_leftJoystick.getY() and m_rightJoystick.getY().
     */
    m_driveTrain.tankDrive(m_leftJoystick.getY(), m_rightJoystick.getY());
  }

  /**
   * Called once the command ends or is interrupted.
   * 
   * @param interrupted if the command was interrupted
   */
  @Override
  public void end(boolean interrupted) {
  }

  /**
   * Returns true when the command should end.
   * 
   * @return if the command should end
   */
  @Override
  public boolean isFinished() {
    return false;
  }
}
