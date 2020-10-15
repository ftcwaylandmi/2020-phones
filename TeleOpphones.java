package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="TeleOpphones", group="1186")
public class TeleOpphones  extends OpMode{
    Robot myrobot = new Robot();
    int a = 1;
    double left = 0.00;
    double right = 0.00;

    @Override
    public void init() {
        myrobot.initHW(hardwareMap);
        a = 10;
    }
    @Override
    public void loop() {
        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;

        if (gamepad1.right_bumper) {
            myrobot.LeftDrive(left);
            myrobot.RightDrive(right);
        } else {
            myrobot.LeftDrive(left / 2);
            myrobot.RightDrive(right / 2);
        }
    }
}