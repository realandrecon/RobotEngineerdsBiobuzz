package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Hardware {
    DcMotorEx frontLeft, rearLeft, frontRight, rearRight;
    public void init(HardwareMap hwMap){  // redenumim HardwareMap in hwMap (ease of use)
        frontLeft  = hwMap.get(DcMotorEx.class, "frontLeft");
        rearLeft   = hwMap.get(DcMotorEx.class, "rearLeft");
        frontRight = hwMap.get(DcMotorEx.class, "frontRight");
        rearRight  = hwMap.get(DcMotorEx.class, "rearRight");
    }

}
