package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.RobotHardware;


public class Robot {
    RobotHardware myself = new RobotHardware();
    double InchesPerSecond = 2.00;

    public void initHW(HardwareMap ahwMap) {
        myself.init(ahwMap);
    }

    public void Drive(double s) {
        myself.leftfrontDrive.setPower(s);
        myself.leftrearDrive.setPower(s);
        myself.rightfrontDrive.setPower(s);
        myself.rightrearDrive.setPower(s);
    }

    public void StopDrive() {
        myself.leftfrontDrive.setPower(0);
        myself.leftrearDrive.setPower(0);
        myself.rightfrontDrive.setPower(0);
        myself.rightrearDrive.setPower(0);
    }

    public void SpinRight(double s) {
        myself.rightfrontDrive.setPower(-s);
        myself.rightrearDrive.setPower(-s);
        myself.leftfrontDrive.setPower(s);
        myself.leftrearDrive.setPower(s);
    }

    public void SpinLeft(double s) {
        myself.leftfrontDrive.setPower(s);
        myself.leftrearDrive.setPower(s);
        myself.rightfrontDrive.setPower(-s);
        myself.rightrearDrive.setPower(-s);
    }

    public void RightDrive(double s) {
        myself.rightfrontDrive.setPower(s);
        myself.rightrearDrive.setPower(s);
    }

    public void LeftDrive(double s) {
        myself.leftrearDrive.setPower(s);
        myself.leftfrontDrive.setPower(s);

    }

    public void DriveByInchesTimeSetPower(int inches, double power) {
        double waitTime = 0.00;
        if (inches > 0) {

            waitTime = inches * InchesPerSecond;
            Drive(power);
        } else {
            inches = -inches;
            waitTime = inches * InchesPerSecond;
            Drive(-power);

        }
        ElapsedTime timer = new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < (waitTime * 100)) {

        }
        StopDrive();

    }


}