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
    // Motor IDs from Constants.MotorIDs
    /**
     * Motor 1 Instance of TalonFX (CTRE/Falcon500)
     * <p>ID from {@link #motor1ID} in {@link frc.robot.Constants.MotorIDs}
     */
    TalonFX motor1 = new TalonFX(motor1ID);
    /**
     * Motor 2 Instance of SparkMax (Rev Robotics/Neo)
     * <p>ID from {@link #motor2ID} in {@link frc.robot.Constants.MotorIDs}
     */
    SparkMax motor2 = new SparkMax(motor2ID, SparkMax.MotorType.kBrushless);
    /**
     * Motor 3 Instance of SparkMax (Rev Robotics/Neo)
     * <p>ID from {@link #motor3ID} in {@link frc.robot.Constants.MotorIDs}
     */
    SparkMax motor3 = new SparkMax(motor3ID, SparkMax.MotorType.kBrushless);

    /**
     * Creates a new MotorsAdvenced subsystem instance.
     */
    public MotorsAdvenced() {
    }

    // Motor 1 Methods
    /**
     * Runs Motor 1 at full speed. Sets speed to 1.
     */
    public void runMotor1() {
        motor1.set(1);
    }
    /**
     * Stops Motor 1. Sets speed to 0.
     */
    public void stopMotor1() {
        motor1.set(0);
    }

    // Motor 2 Methods
    /**
     * Runs Motor 2 at voltage of 5V.
     */ 
    public void runMotor2() {
        motor2.setVoltage(5);
    }
    /**
     * Stops Motor 2. Sets voltage to 0V.
     */
    public void stopMotor2() {
        motor2.setVoltage(0);
    }

    // Motor 3 Methods
    /**
     * Runs Motor 3 at given speed.
     * 
     * @param speed Speed to run motor at. Range from -1 to 1.
     */
    public void runMotor3(double speed) {
        motor3.set(speed);
    }

    // Commands
    /**
     * Command to run Motor 1 using the {@link #runMotor1} as run and {@link #stopMotor1} as end.
     * 
     * @return Command to run Motor 1.
     */
    public Command runMotor1Command() {
        return Commands.runEnd(this::runMotor1, () -> stopMotor1(), this);
    }
    /**
     * Command to run Motor 2 using the {@link #runMotor2} as run and {@link #stopMotor2} as end.
     * 
     * @return Command to run Motor 2.
     */
    public Command runMotor2Command() {
        return Commands.runEnd(this::runMotor2, () -> stopMotor2(), this);
    }
    /**
     * Command to run Motor 3 using the {@link #runMotor3(double)} method with controller left Y axis input.
     * 
     * @param controller The controller to get input from.
     * @return Command to run Motor 3.
     */
    public Command runMotor3Command(CommandXboxController controller) {
        return Commands.run(() -> runMotor3(controller.getLeftY()), this);
    }
}
