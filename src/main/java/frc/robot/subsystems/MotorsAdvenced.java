package frc.robot.subsystems;

import static frc.robot.Constants.MotorIDs.motor1ID;
import static frc.robot.Constants.MotorIDs.motor2ID;
import static frc.robot.Constants.MotorIDs.motor3ID;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class MotorsAdvenced extends SubsystemBase{
    // Motor Instances
    TalonFX motor1 = new TalonFX(motor1ID);
    SparkMax motor2 = new SparkMax(motor2ID, SparkMax.MotorType.kBrushless);
    SparkMax motor3 = new SparkMax(motor3ID, SparkMax.MotorType.kBrushless);

    public MotorsAdvenced() {
    }

    public void runMotor1() {
        motor1.set(1);
    }
    public void stopMotor1() {
        motor1.set(0);
    }

    public void runMotor2() {
        motor2.setVoltage(1);
    }
    public void stopMotor2() {
        motor2.setVoltage(0);
    }

    public void runMotor3(double speed) {
        motor3.set(speed);
    }

    public Command runMotor1Command() {
        return Commands.runEnd(this::runMotor1, () -> stopMotor1(), this);
    }

    public Command runMotor2Command() {
        return Commands.runEnd(this::runMotor2, () -> stopMotor2(), this);
    }

    public Command runMotor3Command(CommandXboxController controller) {
        return Commands.run(() -> runMotor3(controller.getLeftY()), this);
    }
}
