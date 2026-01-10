package frc.robot.subsystems

import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.SubsystemBase

class SwerveSubsystem: SubsystemBase() {
    /** Creates a new ExampleSubsystem.  */
    fun SwerveSubsystem() {}

    /**
     * Example command factory method.
     *
     * @return a command
     */
    fun exampleMethodCommand(): Command? {
        // Inline construction of command goes here.
        // Subsystem::RunOnce implicitly requires `this` subsystem.
        return runOnce {}
    }

    /**
     * An example method querying a boolean state of the subsystem (for example, a digital sensor).
     *
     * @return value of some boolean subsystem state, such as a digital sensor.
     */
    fun exampleCondition(): Boolean {
        // Query some boolean state, such as a digital sensor.
        return false
    }

    override fun periodic() {
        // This method will be called once per scheduler run
    }

    override fun simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}