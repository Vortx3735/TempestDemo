/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Pneumatic Intake on Tempest
 */
public class Intake extends Subsystem {
  Solenoid intakeSolenoid = new Solenoid(1);

  public Intake() {
    intakeSolenoid.set(false);
  }

  public void lift() {
    intakeSolenoid.set(!intakeSolenoid.get());

  }

  @Override
  public void initDefaultCommand() {
  }
}
