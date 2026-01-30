package org.firstinspires.ftc.teamcode.Command;

import com.arcrobotics.ftclib.command.CommandBase;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.Subsystem.transferSubsystem;

public class teleOpTransferCommand extends CommandBase {

    transferSubsystem transferSubsystem;
    DcMotor transferMotor;
    double transferSpeed;

    public teleOpTransferCommand(transferSubsystem transferSubsystem, double transferSpeed){
        this.transferSubsystem = transferSubsystem;
        this.transferMotor = transferSubsystem.getTransferMotor();
        this.transferSpeed = transferSpeed;
        addRequirements(transferSubsystem);

    }

    @Override
    public void initialize() {
        transferMotor.setPower(0);

    }

    @Override
    public void execute() {

        transferMotor.setPower(transferSpeed);

    }

    @Override
    public void end(boolean interrupted) {
        transferMotor.setPower(0);

    }

}