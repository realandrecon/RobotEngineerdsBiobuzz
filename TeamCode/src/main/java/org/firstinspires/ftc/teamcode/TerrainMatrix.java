package org.firstinspires.ftc.teamcode;

import static java.lang.Math.abs;
import static java.lang.Math.acos;
import static java.lang.Math.round;
import static java.lang.Math.tan;



public class TerrainMatrix {
    public double semnunghi,i=1,j=1;
    static final double pi = Math.PI;

    public char[][] Imagine ={
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','R','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.','.','.','.'}
    };

    public void unghiLaCoord(double unghi){
        unghi=unghi*pi/180;
        unghi=tan(unghi);
    }


    public void orientare(double unghi){
        semnunghi=unghi/abs(unghi);
        unghi=abs(unghi);
        Imagine[(int)i][(int)j]='.';
        if(unghi<=45){
            unghiLaCoord(unghi);
            unghi=unghi*6;
            unghi=round(unghi)*semnunghi;
            i=0;
            j=unghi+6;
        }else if(unghi<=90){
            unghi=abs(unghi-90);
            unghiLaCoord(unghi);
            unghi=12-unghi*6;
            unghi=round(unghi)*semnunghi;
            i=abs(unghi-6*semnunghi);
            if(semnunghi==-1.0)
                j=0;
            else
                j=12;
        }else if(unghi<=135){
            unghi=unghi-90;
            unghiLaCoord(unghi);
            unghi=12+unghi*6;
            unghi=round(unghi)*semnunghi;
            i=abs(unghi-6*semnunghi);
            if(semnunghi==-1.0)
                j=0;
            else
                j=12;
        }else{
            unghi=abs(unghi-180);
            unghiLaCoord(unghi);
            unghi=24-unghi*6;
            unghi=round(unghi)*semnunghi;
            i=12;
            if(semnunghi==-1.0)
                j=abs(18*semnunghi-unghi);
            else
                j=12-abs(18*semnunghi-unghi);
        }
    }
}
