import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;
    DodgemCar dodgemCar;
    QuadBike quadBike;

    @Before
    public void before() {
        dodgemCar = new DodgemCar(60,1);
        quadBike = new QuadBike(50, 750);
        driver = new Driver ("Dario Franchitti",quadBike);
    }

    @Test
    public void canGetName(){
        assertEquals("Dario Franchitti", driver.getName());
    }

    @Test
    public void getDriveDistance(){
        assertEquals(1,driver.driveDistance(50));
    }

    @Test
    public void canSetVehicle(){
        driver.setVehicle(dodgemCar);
        assertEquals(10,driver.driveDistance(600));
    }
}
