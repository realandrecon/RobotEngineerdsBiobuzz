package org.firstinspires.ftc.teamcode;

public class DriveTrain {
    public static double x,y,rx,nj, frontLeft,frontRight,rearLeft, rearRight; //declaram axe, denominator si roti individuale

    public void drive(double a, double b, double c){
        x = a;
        y = -b;
        rx = c;
        nj = Math.max(Math.abs(y)+Math.abs(x)+Math.abs(rx),1);
        frontLeft= (y + x + rx) / nj;           //calculare roata fata stanga
        frontRight = (y - x - rx) / nj;         //calculare roata fata dreapta
        rearLeft = (y - x + rx) / nj;           //calculare roata spate stanga
        rearRight = (y + x - rx) / nj;          //calculare roata spate dreapta
    }
}
