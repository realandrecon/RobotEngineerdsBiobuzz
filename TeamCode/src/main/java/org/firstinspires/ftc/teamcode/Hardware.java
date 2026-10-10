package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardware {
    public static DcMotorEx leftFront, leftRear, rightFront, rightRear, motorShooter;
    public static IMU imu;
    public static Servo servo1;

    public void initHardware(HardwareMap hw){
        leftFront = hw.get(DcMotorEx.class, "leftFront");
        leftRear = hw.get(DcMotorEx.class, "leftRear");
        rightFront = hw.get(DcMotorEx.class, "rightFront");
        rightRear = hw.get(DcMotorEx.class, "rightRear");
        motorShooter = hw.get(DcMotorEx.class, "motorShooter");

        servo1 = hw.get(Servo.class, "servo1");

        imu = hw.get(IMU.class, "imu");

        RevHubOrientationOnRobot orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.LEFT, RevHubOrientationOnRobot.UsbFacingDirection.FORWARD);
        IMU.Parameters parameters = new IMU.Parameters(orientation);
        imu.initialize(parameters);

        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        leftRear.setDirection(DcMotorSimple.Direction.REVERSE);

        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
}

