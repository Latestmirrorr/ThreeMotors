package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.MotorIDs.*;

public class Motors extends SubsystemBase {
    // Motor Instances
    // Motor IDs from Constants.MotorIDs
    /**
     * Neo Motor Instance
     * <p>ID from {@link #neoMotorID} in {@link frc.robot.Constants.MotorIDs}
     */
    SparkMax neoMotor = new SparkMax(neoMotorID, SparkMax.MotorType.kBrushless);
    /**
     * CIM Motor Instance
     * <p>ID from {@link #cimMotorID} in {@link frc.robot.Constants.MotorIDs}
     */
    VictorSP cimMotor = new VictorSP(cimMotorID);
    /**
     * Falcon Motor Instance
     * <p>ID from {@link #falconMotorID} in {@link frc.robot.Constants.MotorIDs}
     */
    TalonFX falconMotor = new TalonFX(falconMotorID);

    public Motors() {
    }

    // Neo Motor Methods
    /**
     * Runs the Neo motor at full speed. Sets speed to 1.
     */
    public void runNeo() {
        neoMotor.set(1);
    }
    /**
     * Stops the Neo motor. Sets speed to 0.
     */
    public void stopNeo() {
        neoMotor.set(0);
    }

    // CIM Motor Methods
    /**
     * Runs the CIM motor at full speed. Sets speed to 1.
     */
    public void runCim() {
        cimMotor.set(1);
    }
    /**
     * Stops the CIM motor. Sets speed to 0.
     */
    public void stopCim() {
        cimMotor.set(0);
    }

    // Falcon Motor Methods
    /**
     * Runs the Falcon motor at full speed. Sets speed to 1.
     */
    public void runFalcon() {
        falconMotor.set(1);
    }
    /**
     * Stops the Falcon motor. Sets speed to 0.
     */
    public void stopFalcon() {
        falconMotor.set(0);
    }

    // Commands to run motors
    /**
     * Sets up a command that uses the {@link #runNeo} method for run, to run every iteration, and the {@link #stopNeo} method for end, to run for interuptions.
     * 
     * @return The command to run the Neo motor.
     * 
     * @see runNeo()
     * @see stopNeo()
     */
    public Command runNeoCommand() {
        return Commands.runEnd(this::runNeo, () -> stopNeo(), this);
    }
    /**
     * Sets up a command that uses the {@link #runCim} method for run, to run every iteration, and the {@link #stopCim} method for end, to run for interuptions.
     * 
     * @return The command to run the CIM motor.
     * 
     * @see runCim()
     * @see stopCim()
     */
    public Command runCimCommand() {
        return Commands.runEnd(this::runCim, () -> stopCim(), this);
    }
    /**
     * Sets up a command that uses the {@link #runFalcon} method for run, to run every iteration, and the {@link #stopFalcon} method for end, to run for interuptions.
     * 
     * @return The command to run the Falcon motor.
     * 
     * @see runFalcon()
     * @see stopFalcon()
     */
    public Command runFalconCommand() {
        return Commands.runEnd(this::runFalcon, () -> stopFalcon(), this);
    }
}
