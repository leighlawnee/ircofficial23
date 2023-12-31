package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class RotateArm extends CommandBase{
    Arm arm;
    double speed;

   public RotateArm(Arm a, double s){
    speed = s;
    arm = a;
    addRequirements(arm);
    }

    public void execute(){
        arm.moveArm(speed);
    }

    public boolean isFinished(){
        return false;
    }

    public void end(boolean stop){
        arm.stop();
    }
}
