import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemCarTest {

    DodgemCar dodgemCar;

    @Before
    public void before() {
        dodgemCar = new DodgemCar(60,1);
    }

    @Test
    public void canGetTimeTaken(){
        assertEquals(10, dodgemCar.driveDistance(600));
    }

    @Test
    public void canGetNumberOfSeats(){
        assertEquals(1,dodgemCar.getSeats());
    }
}
