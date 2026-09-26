package org.firstinspires.ftc.teamcode;
// clasa de miscare robot

import static org.firstinspires.ftc.teamcode.Hardware.frontLeftH;
import static org.firstinspires.ftc.teamcode.Hardware.frontRightH;
import static org.firstinspires.ftc.teamcode.Hardware.rearLeftH;
import static org.firstinspires.ftc.teamcode.Hardware.rearRightH;

public class DriveTrain {
    public static double x,y,rx,denominator, frontLeftD,frontRightD,rearLeftD, rearRightD; //declaram axe, denominator si roti individuale

    public void drive(double a, double b, double c){
        x = a;                                          // miscare stanga-dreapta
        y = -b;                                         // miscare sus-jos
        rx = c;                                         // rotatie
        denominator = Math.max(Math.abs(y)+Math.abs(x)+Math.abs(rx),1);
        frontLeftD   = (y + x + rx) / denominator;		//calculare roata fata stanga
        frontRightD  = (y - x - rx) / denominator;		//calculare roata fata dreapta
        rearLeftD    = (y - x + rx) / denominator;		//calculare roata spate stanga
        rearRightD   = (y + x - rx) / denominator;		//calculare roata spate dreapta
        frontLeftH.setPower(frontLeftD);
        rearLeftH.setPower(rearLeftD);
        frontRightH.setPower(frontRightD);
        rearRightH.setPower(rearRightD);
    }
}
