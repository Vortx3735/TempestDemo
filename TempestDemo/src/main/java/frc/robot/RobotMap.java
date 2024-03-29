/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  /**
   * We use nested classes as a way to organize these constants. Examples: - Right
   * DriveTrain motor ID will be called by RobotMap.Drive.rightMotor - Elevator
   * motor ID will be called by RobotMap.Drive.rightMotor
   */
  public static class Drive {
    // These values can be found by looking at the wiring of your actual robot.
    public static final int R1 = 10;
    public static final int R2 = 11;
    public static final int R3 = 12;

    public static final int L1 = 4;
    public static final int L2 = 5;
    public static final int L3 = 3;

  }
  
  public static class Shooter {
    public static final int left = 7;
    public static final int right = 2;
	  public static final int lift = 8;

  }

  public static class Controller {
    // These values can be found using your Driver Station.
    public static final int MAIN = 0;
    public static final int CO = 1;

  }

  public static class Constants{
    public static final double InchesPerTick = .00309196;
  }

  public static class Pneumatics{
    public static final int intake = 1;
  }

}
