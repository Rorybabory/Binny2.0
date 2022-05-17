// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  CANSparkMax left;
  CANSparkMax right;
  DifferentialDrive drive;
  /** Creates a new ExampleSubsystem. */
  public DriveTrain() {
    left = new CANSparkMax(Constants.DRIVE_LEFT_CAN, MotorType.kBrushless);
    right = new CANSparkMax(Constants.DRIVE_RIGHT_CAN, MotorType.kBrushless);
    drive = new DifferentialDrive(left, right);
  }
  public void arcadeDrive(double x, double y) {
    drive.arcadeDrive(x, y);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
