package org.firstinspires.ftc.teamcode;
// clasa de miscare robot

import static org.firstinspires.ftc.teamcode.Hardware.frontLeftH;
import static org.firstinspires.ftc.teamcode.Hardware.frontRightH;
import static org.firstinspires.ftc.teamcode.Hardware.backLeftH;
import static org.firstinspires.ftc.teamcode.Hardware.backRightH;

public class DriveTrain {
    double x,y,rx,denominator, frontLeftD,frontRightD, backLeftD, backRightD; //declaram axe, denominator si roti individuale

    public void drive(double a, double b, double c){
        x = a;                                          // miscare stanga-dreapta
        y = -b;                                         // miscare sus-jos
        rx = c;                                         // rotatie
        denominator = Math.max(Math.abs(y)+Math.abs(x)+Math.abs(rx),1);
        frontLeftD   = (y + x + rx) / denominator;		//calculare roata fata stanga
        frontRightD  = (y - x - rx) / denominator;		//calculare roata fata dreapta
        backLeftD    = (y - x + rx) / denominator;		//calculare roata spate stanga
        backRightD = (y + x - rx) / denominator;		//calculare roata spate dreapta
        frontLeftH.setPower(frontLeftD);                //de la inputul controllerului duce putere la fiecare motor
        backLeftH.setPower(backLeftD);
        frontRightH.setPower(frontRightD);
        backRightH.setPower(backRightD);
    }
}
