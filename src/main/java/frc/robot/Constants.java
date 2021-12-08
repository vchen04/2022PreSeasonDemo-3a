// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    /**
     * The PWM port the left drive train motor is plugged into.
     */
    public static int kLeftDriveTrainMotor = 1;

    /**
     * The PWM port the right drive train motor is plugged into.
     */
    public static int kRightDriveTrainMotor = 2;

    /**
     * The USB port the left joystick which controls the left drive train motors
     * is plugged into.
     */
    public static int kLeftJoystickPort = 1;

    /**
     * The USB port the right joystick which controls the right drive train
     * motors is plugged into.
     */
    public static int kRightJoystickPort = 2;
}
