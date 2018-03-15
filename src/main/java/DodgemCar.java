public class DodgemCar extends Vehicle implements IDriveable {
    int numberOfSeats;

    public DodgemCar(int averageSpeed, int numberOfSeats) {
        super(averageSpeed);
        this.numberOfSeats = numberOfSeats;
    }

//    int averageSpeed;

    public int getSeats(){
        return this.numberOfSeats;
    }
//
//    public DodgemCar(int averageSpeed) {
//        this.averageSpeed = averageSpeed;
//    }
//
//    @Override
//    public int driveDistance(int distance) {
//        return distance / this.averageSpeed;
//    }
}
