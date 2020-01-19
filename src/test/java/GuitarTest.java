import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(6, "brown", "wood", "electric", 50, 100);
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getStrings());

    }




}
