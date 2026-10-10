package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Hardware.motorShooter;

import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.concurrent.TimeUnit;

public class Motors {
    ElapsedTime timerShooter = new ElapsedTime();
    boolean adevar = false;
    public void Shooter(boolean buton){
        if(buton&&!adevar){
            timerShooter.reset();
            adevar = true;
        }
        if(adevar&&timerShooter.time(TimeUnit.MILLISECONDS)>0){
            motorShooter.setPower(0.5);
        }
        if(adevar&&timerShooter.time(TimeUnit.MILLISECONDS)>1000){
            motorShooter.setPower(0.7);
        }
        if(adevar&&timerShooter.time(TimeUnit.MILLISECONDS)>1500){
            motorShooter.setPower(1);
        }
        if(adevar&&timerShooter.time(TimeUnit.MILLISECONDS)>2000){
            motorShooter.setPower(0);
            adevar=false;
        }
    }
}
