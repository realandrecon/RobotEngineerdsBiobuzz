package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="TeleOpEngineerds")
public class TeamTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DriveTrain driveTrain=new DriveTrain();
        Hardware hardware=new Hardware();
        hardware.initHardware(hardwareMap);
        waitForStart();
        while (opModeIsActive()){
            driveTrain.drive(gamepad1.left_stick_x,gamepad1.left_stick_y, gamepad1.right_stick_x);
        }
    }
}
