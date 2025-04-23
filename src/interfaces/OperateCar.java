package interfaces;

enum Direction {
    right, left, up, down
};

public interface OperateCar {
    // constant declarations, if any

    // method signatures
    // an enum with values RIGHT, LEFT
    public int turn(Direction direction, double radius, double startSpeed, double endSpeed);

    public int changeLanes(Direction direction, double startSpeed, double endSpeed);

    public int getRadarFront(double distanceToCar, double speedOfCar);

    public int getRadarRear(double distanceToCar, double speedOfCar);

    // more method signatures
}