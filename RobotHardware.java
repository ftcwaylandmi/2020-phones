package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;

class RobotHardware {
    public DcMotor leftfrontDrive = null;
    public DcMotor rightfrontDrive = null;
    public DcMotor leftrearDrive = null;
    public DcMotor rightrearDrive = null;
    HardwareMap hwMap= null;
    public RobotHardware () {

    }

    public void init (HardwareMap ahwMap) {
        hwMap = ahwMap;

        leftfrontDrive = hwMap.get(DcMotor.class, "lfd");

        rightfrontDrive = hwMap.get(DcMotor.class, "rfd");

        leftrearDrive = hwMap.get(DcMotor.class, "lrd");

        rightrearDrive = hwMap.get(DcMotor.class, "rrd");

        leftfrontDrive.setDirection(DcMotor.Direction.FORWARD);

        leftrearDrive.setDirection(DcMotor.Direction.FORWARD);

        rightfrontDrive.setDirection(DcMotor.Direction.REVERSE);

        rightrearDrive.setDirection(DcMotor.Direction.REVERSE);

        leftfrontDrive.setPower(0);

        rightfrontDrive.setPower(0);

        leftrearDrive.setPower(0);

        rightrearDrive.setPower(0);

        leftfrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        rightfrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        leftrearDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        rightrearDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        }
    }
