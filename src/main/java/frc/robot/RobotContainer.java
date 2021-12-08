// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.TeleopDriveCommand;
import frc.robot.subsystems.DriveTrainSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  /*
   * The robot's subsystems and commands are defined here...
   */

  /**
   * The robot's drive train.
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
   * The teleop drive command, which should be run periodically while the robot
   * is in the teleoperated state.
   */
  private final TeleopDriveCommand m_teleopDriveCommand;

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    /*
     * Initialize the m_driveTrain variable.
     */
    m_driveTrain = new DriveTrainSubsystem();

    /*
     * Initilaize the m_leftJoystick and m_rightJoystick variables.
     */
    m_leftJoystick = new Joystick(Constants.kLeftJoystickPort);
    m_rightJoystick = new Joystick(Constants.kRightJoystickPort);

    /*
     * Initialize the m_teleopDriveCommand variable.
     */
    m_teleopDriveCommand = new TeleopDriveCommand(m_driveTrain, m_leftJoystick, m_rightJoystick);

    /*
     * We have created our TeleopDriveCommand object, but we still need to
     * confiogure when the command is run. Since we want our drive train to
     * always respond to driver input, we need to configure this command to be
     * run periodically. To do this, we can set the DriveTrainSubsystem's
     * default command to be our TeleopDriveCommand using the
     * DriveTrainSubsystem's setDefaultCommand method.
     */
    m_driveTrain.setDefaultCommand(m_teleopDriveCommand);

    /*
     * Configure the button bindings. Unused in this example.
     */
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by instantiating a {@link GenericHID} or one of its subclasses
   * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and
   * then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    /*
     * Nothing needed here in this example.
     */
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    /*
     * No autonomous commands are used in this example.
     */
    return null;
  }
}
