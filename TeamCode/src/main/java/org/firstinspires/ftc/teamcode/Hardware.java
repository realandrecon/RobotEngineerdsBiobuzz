package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Hardware {
    public static DcMotorEx frontLeftH, rearLeftH, frontRightH, rearRightH;
    public void init(HardwareMap hwMap){  // redenumim HardwareMap in hwMap (ease of use)
        frontLeftH  = hwMap.get(DcMotorEx.class, "frontLeftH");
        rearLeftH   = hwMap.get(DcMotorEx.class, "rearLeftH");
        frontRightH = hwMap.get(DcMotorEx.class, "frontRightH");
        rearRightH  = hwMap.get(DcMotorEx.class, "rearRightH");
    }

}
