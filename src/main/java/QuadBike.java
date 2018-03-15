public class QuadBike extends Vehicle implements IDriveable {
    int engineCapacity;

    public QuadBike(int averageSpeed, int engineCapacity) {
        super(averageSpeed);
        this.engineCapacity = engineCapacity;

    }

//    int averageSpeed;

    public int getEngineSize() {
        return engineCapacity;
    }

//    public QuadBike(int averageSpeed) {
//        this.averageSpeed = averageSpeed;
//    }
//
//    @Override
//    public int driveDistance(int distance) {
//        return this.averageSpeed / distance;
//    }
}
