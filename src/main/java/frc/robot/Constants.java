// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int driverID = 0;
  }

  // Motor IDs
  /**
   * Motor ID Constants
   */
  public static class MotorIDs {
    /** CIM Motor ID */
    public static final int cimMotorID = 1;
    /** Falcon Motor ID */
    public static final int falconMotorID = 2;
    /** Neo Motor ID */
    public static final int neoMotorID = 3;
  }
}
