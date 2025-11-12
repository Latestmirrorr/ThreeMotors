package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motors extends SubsystemBase {
    SparkMax neoMotor = new SparkMax(1, SparkMax.MotorType.kBrushless);
    VictorSP cimMotor = new VictorSP(3);
    TalonFX falconMotor = new TalonFX(2);

    public Motors() {
    }

    public void runNeo() {
        neoMotor.set(1);
    }
    public void stopNeo() {
        neoMotor.set(0);
    }

    public void runCim() {
        cimMotor.set(1);
    }
    public void stopCim() {
        cimMotor.set(0);
    }

    public void runFalcon() {
        falconMotor.set(1);
    }
    public void stopFalcon() {
        falconMotor.set(0);
    }

    public Command runNeoCommand() {
        return Commands.runEnd(this::runNeo, () -> stopNeo(), this);
    }
    public Command runCimCommand() {
        return Commands.runEnd(this::runCim, () -> stopCim(), this);
    }
    public Command runFalconCommand() {
        return Commands.runEnd(this::runFalcon, () -> stopFalcon(), this);
    }

}
