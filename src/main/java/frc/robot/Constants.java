package frc.robot;

import edu.wpi.first.wpilibj.I2C;
import frc.robot.robot_utils.*;

// TODO: check all values and make sure they are correct
public class Constants {

    public static class Control {
        public static final int XY_STICK_ID = 0;
        public static final int Z_STICK_ID = 1;
        public static final int CONTROLLER_ID = 2;
    }

    public static class MotorFlip {
        // TODO: May need to be changed later.
        public final static boolean SHOOTER_FLIPPED = false;
        public final static boolean ADJUSTOR_FLIPPED = false;
    }

    public static class TestValue {
        // You can change the default Testing mode to be run here, when Driver Station
        // is in testing mode.
        public final static TestUtil.TestMode DEFAULT_TEST_MODE = TestUtil.TestMode.SHOOTER_ANGLE_TEST;
    }

    public static class IntakeShooter {

        // The shooter motor in the Shooter device, runs at Full Speed and shoots the ball.
        public static final int SHOOTER_MOTOR_PORT = 5;

        // Left Intake Extend Motor Port

        public static final int SHOOTER_WHEEL_RADIUS = 0;


        public static final double ADJUSTOR_GEAR_RATIO = /*1:*/160;

        // Shooter Adjustment Motor
        public static final int SHOOTER_ADJUSTMENT_PORT = 8;
    }
    
    
    // These values are designed to be changed based on the Motor 
    public static class MotorValue {
        public static final double SHOOT_SPEED = 1.0;
        public static final double ACCEPT_SPEED = 0.3;
        public static final double SLOW_ACCEPT_SPEED = 0.2;

        public static final double ADJUSTOR_SPEED = 0.3;

        // Stall current in amps, stops the motor when the current rises above
        // the maximum value.
        public final static double STALL_CURRENT = 80;
        
        // Stall RPM, stops the motor when the RPM drops below + current above limit.
        public final static double STALL_RPM = 2000;

        // Target RPM for the Shooter Motor to activate loading
        public final static double SHOOTER_TARGET_RPM = 4800;

        // Used for stall protection, disable if any issues occur from it.
        public final static boolean CURRENT_MEASURING = true;
    }
}
