package org.firstinspires.ftc.teamcode;

// clasa de miscare robot

public class DriveTrain {
    public static double x,y,rx,denominator, frontLeft,frontRight,rearLeft, rearRight; //declaram axe, denominator si roti individuale

    public void drive(double a, double b, double c){
        x = a;                                          // miscare stanga-dreapta
        y = -b;                                         // miscare sus-jos
        rx = c;                                         // rotatie
        denominator = Math.max(Math.abs(y)+Math.abs(x)+Math.abs(rx),1);
        frontLeft   = (y + x + rx) / denominator;		//calculare roata fata stanga
        frontRight  = (y - x - rx) / denominator;		//calculare roata fata dreapta
        rearLeft    = (y - x + rx) / denominator;		//calculare roata spate stanga
        rearRight   = (y + x - rx) / denominator;		//calculare roata spate dreapta
    }
}
