package org.example.RobotController;

public interface IRobotController {

    public void emergencyStop();

    public void moveForward();

    public void moveReverse();

    public void turnLeft();

    public void turnRight();

    public void setMovmentSpeed(int motorA, int motorB);
    public void strategy_1();
    public String getSensorValues();

    public void sendCommand(String command);



}
