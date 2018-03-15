public abstract class Vehicle {

    int averageSpeed;

    public Vehicle(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public int driveDistance(int distance) {
        return distance / this.averageSpeed;
    }
}



//public abstract class Carpet {
//    String colour;
//
//    public Carpet(String colour) {
//        this.colour = colour;
//    }
//
//    public String getColour() {
//        return this.colour;
//    }
//}