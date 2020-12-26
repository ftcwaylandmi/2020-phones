package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

class RobotHardware {

    public DcMotor leftfrontDrive = null;
    public DcMotor rightfrontDrive = null;
    public DcMotor leftrearDrive = null;
    public DcMotor rightrearDrive = null;
    public DcMotor beltMotor = null;
    public DcMotor feederMotor = null;
    public DcMotor shooterMotor = null;

    HardwareMap hwMap= null;

    public RobotHardware () {

    }

    public void init (HardwareMap ahwMap) {
        hwMap = ahwMap;

        leftfrontDrive = hwMap.get(DcMotor.class, "lfd");
        rightfrontDrive = hwMap.get(DcMotor.class, "rfd");
        leftrearDrive = hwMap.get(DcMotor.class, "lrd");
        rightrearDrive = hwMap.get(DcMotor.class, "rrd");
        leftfrontDrive.setDirection(DcMotor.Direction.REVERSE);
        leftrearDrive.setDirection(DcMotor.Direction.REVERSE);
        rightfrontDrive.setDirection(DcMotor.Direction.FORWARD);
        rightrearDrive.setDirection(DcMotor.Direction.FORWARD);
        beltMotor.setDirection(DcMotor.Direction.FORWARD);
        feederMotor.setDirection(DcMotor.Direction.FORWARD);
        shooterMotor.setDirection(DcMotor.Direction.FORWARD);

        leftfrontDrive.setPower(0);
        rightfrontDrive.setPower(0);
        leftrearDrive.setPower(0);
        rightrearDrive.setPower(0);
        beltMotor.setPower(0);
        feederMotor.setPower(0);
        shooterMotor.setPower(0);


        leftfrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightfrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftrearDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightrearDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        beltMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        feederMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        shooterMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        }

    }
