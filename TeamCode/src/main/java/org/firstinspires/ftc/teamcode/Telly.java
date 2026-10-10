package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Hardware.imu;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.YawPitchRollAngles;

@TeleOp(name="TellyBelly")
public class Telly extends LinearOpMode{
    @Override
    public void runOpMode() throws InterruptedException {

        Hardware hardware = new Hardware();
        DriveTrain driveTrain = new DriveTrain();
        DashVariables dashVars = new DashVariables();
        Motors motors = new Motors();
        Servos servos = new Servos();
        TerrainMatrix terrainMatrix = new TerrainMatrix();

        hardware.initHardware(hardwareMap);

        telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());

        imu.resetYaw();

        waitForStart();
        while(opModeIsActive()){
            YawPitchRollAngles angles = imu.getRobotYawPitchRollAngles();
            double unghi = -angles.getYaw(AngleUnit.DEGREES);


            driveTrain.drive(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);
            motors.Shooter(gamepad1.a);
            servos.Gheara(dashVars.pozitieServo);

            terrainMatrix.orientare(unghi);

            telemetry.addData("pozitie servo: ", dashVars.pozitieServo);

            terrainMatrix.Imagine[(int) terrainMatrix.i][(int) terrainMatrix.j]='O';
            for(int rand=0;rand<=12;rand++){
                String linie="";
                for(int coloana=0;coloana<=12;coloana++){
                    linie = linie + terrainMatrix.Imagine[rand][coloana]+"  ";
                }
                String afis=""+rand;
                telemetry.addData(afis,linie);
            }
            telemetry.update();
        }
    }
}
