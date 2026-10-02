package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Hardware {
    public static DcMotorEx frontLeftH, backLeftH, frontRightH, backRightH;
    public void initHardware(HardwareMap hwMap){  // redenumim HardwareMap in hwMap (ease of use)
        frontLeftH  = hwMap.get(DcMotorEx.class, "frontLeft"); // da nume la motor ca driver hub sa apeleze la el
        backLeftH   = hwMap.get(DcMotorEx.class, "backLeft");
        frontRightH = hwMap.get(DcMotorEx.class, "frontRight");
        backRightH = hwMap.get(DcMotorEx.class, "backRight");
        frontLeftH.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE); // daca inputul de la controller e zero, franeaza
        backLeftH.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRightH.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRightH.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

}
