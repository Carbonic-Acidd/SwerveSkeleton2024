// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final Mode currentMode = Mode.REAL;

  public static enum Mode {
    REAL,
    SIM,
    REPLAY
  }
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class GyroConstants {
    public static final int gyroID = 1;
  }

  public static class SwerveDriveConstants {
    public static final double TRACK_WIDTH = Units.inchesToMeters(24.0);
    public static final double WHEEL_BASE = Units.inchesToMeters(24.0);

    public static final Translation2d frontLeft =
        new Translation2d(WHEEL_BASE / 2, TRACK_WIDTH / 2);
    public static final Translation2d frontRight =
        new Translation2d(WHEEL_BASE / 2, -TRACK_WIDTH / 2);
    public static final Translation2d backLeft =
        new Translation2d(-WHEEL_BASE / 2, TRACK_WIDTH / 2);
    public static final Translation2d backRight =
        new Translation2d(-WHEEL_BASE / 2, -TRACK_WIDTH / 2);

    public static final Translation2d[] wheelLocations = {
      frontLeft, frontRight, backLeft, backRight
    };
  }

  public static class SwerveModuleConstants {
    public static final double WHEEL_CIRCUMFERENCE = 2;

    public static final double maxSpeed = 12;
    
    public static final double maxTourqueCurrent = 0;

    public static final double kV = 0;
    public static final double kS = 0;
    public static final double kA = 0;

    public static final double kP = 0;
    public static final double kI = 0;
    public static final double kD = 0;

    public static final int voltageLimit = 0;
    public static final int voltageCompensation = 12;

    public static final int FLTurnMotorID = 1;
    public static final int FLDriveMotorID = 1;
    public static final int FLCanCoderID = 1;

    public static final int FRTurnMotorID = 1;
    public static final int FRDriveMotorID = 1;
    public static final int FRCanCoderID = 1;

    public static final int BLTurnMotorID = 1;
    public static final int BLDriveMotorID = 1;
    public static final int BLCanCoderID = 1;

    public static final int BRTurnMotorID = 1;
    public static final int BRDriveMotorID = 1;
    public static final int BRCanCoderID = 1;

    public static double maxCurrent;
  }
}
