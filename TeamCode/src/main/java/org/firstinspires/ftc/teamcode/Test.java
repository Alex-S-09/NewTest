package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;


@TeleOp(name = "test")
public class Test extends LinearOpMode {
    private DcMotorEx motor1;
    private DcMotorEx motor2;
    private DcMotorEx shooter;
    @Override
    public void runOpMode() {
        motor1 = hardwareMap.get(DcMotorEx.class, "motor1");
        motor2 = hardwareMap.get(DcMotorEx.class, "motor2");
        shooter = hardwareMap.get(DcMotorEx.class, "shooter");

        waitForStart();

        while (opModeIsActive()) {
            if(gamepad1.right_bumper) {
                motor1.setPower(-1);
                motor2.setPower(1);
                shooter.setPower(0.7);
            }
            if(gamepad1.left_bumper) {
                motor1.setPower(0);
                motor2.setPower(0);
            }
        }
    }
}
