package frc.robot.subsystems;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestSubsystem extends SubsystemBase {
    
    public TestSubsystem() {
        Shuffleboard.getTab("TestTab").add("Test", 3.0);
    }

    @Override
    public void periodic() {
    }
}
