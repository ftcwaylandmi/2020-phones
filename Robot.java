package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.RobotHardware;


public class Robot {
    RobotHardware myself = new RobotHardware();
    public void initHW(HardwareMap ahwMap) {
        myself.init(ahwMap);
    }
    public void Drive (double s){
                myself.leftfrontDrive.setPower(s);
                myself.leftrearDrive.setPower(s);
                myself.rightfrontDrive.setPower(s);
                myself.rightrearDrive.setPower(s);
    }
    public void StopDrive (){
        myself.leftfrontDrive.setPower(0);
        myself.leftrearDrive.setPower(0);
        myself.rightfrontDrive.setPower(0);
        myself.rightrearDrive.setPower(0);
    }
    public void SpinRight(double s){
        myself.rightfrontDrive.setPower(-s);
        myself.rightrearDrive.setPower(-s);
        myself.leftfrontDrive.setPower(s);
        myself.leftrearDrive.setPower(s);
    }
    public void SpinLeft(double s){
        myself.leftfrontDrive.setPower(s);
        myself.leftrearDrive.setPower(s);
        myself.rightfrontDrive.setPower(-s);
        myself.rightrearDrive.setPower(-s);
    }
       public void RightDrive(double s){
        myself.rightfrontDrive.setPower(s);
        myself.rightrearDrive.setPower(s);
       }
       public void LeftDrive(double s){
        myself.leftrearDrive.setPower(s);
        myself.leftfrontDrive.setPower(s);
       }
    }






