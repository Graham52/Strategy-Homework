import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {

    QuadBike quadBike;

    @Before
    public void before() {
        quadBike = new QuadBike(50,750);
    }

    @Test
    public void canGetTimeTaken(){
        assertEquals(1, quadBike.driveDistance(50));
    }

    @Test
    public void canGetEngineSize(){
        assertEquals(750,quadBike.getEngineSize());
    }
}

