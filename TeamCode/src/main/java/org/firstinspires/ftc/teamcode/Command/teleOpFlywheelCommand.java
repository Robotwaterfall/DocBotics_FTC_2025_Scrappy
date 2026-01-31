package org.firstinspires.ftc.teamcode.Command;

import com.arcrobotics.ftclib.command.CommandBase;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.Subsystem.flywheelSubsystem;

public class teleOpFlywheelCommand extends CommandBase {

    flywheelSubsystem flywheelSub;
    DcMotor flyWheelMotor;
    double flyWheelPower;

    public teleOpFlywheelCommand(flywheelSubsystem flywheelSub, double flywheelPower){
        this.flywheelSub = flywheelSub;
        this.flyWheelMotor = flywheelSub.getFlyWheelMotor();
        this.flyWheelPower = flywheelPower;
        addRequirements(flywheelSub);

    }

    @Override
    public void initialize() {
        flyWheelMotor.setPower(0);

    }

    @Override
    public void execute() {

        flyWheelMotor.setPower(flyWheelPower);

    }

    @Override
    public void end(boolean interrupted) {
        flyWheelMotor.setPower(0);

    }

}
