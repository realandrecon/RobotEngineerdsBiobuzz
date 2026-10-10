package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Hardware.leftFront;
import static org.firstinspires.ftc.teamcode.Hardware.leftRear;
import static org.firstinspires.ftc.teamcode.Hardware.rightFront;
import static org.firstinspires.ftc.teamcode.Hardware.rightRear;

public class DriveTrain {
    public static double x, y, rx, denominator, frontLeft, frontRight, backLeft, backRight;
    public void drive(double a, double b, double c){
        x = a;
        y = -b;
        rx = c;
        denominator = Math.max(Math.abs(y)+Math.abs(x)+Math.abs(rx), 1);
        frontLeft   = (y+x+rx)/denominator;
        frontRight  = (y-x-rx)/denominator;
        backLeft    = (y-x+rx)/denominator;
        backRight   = (y+x-rx)/denominator;

        leftFront.setPower(frontLeft);
        rightFront.setPower(frontRight);
        leftRear.setPower(backLeft);
        rightRear.setPower(backRight);
    }

}

