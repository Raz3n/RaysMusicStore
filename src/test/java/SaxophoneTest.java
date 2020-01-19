import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone(1, "KennyG suave", "brass", "soprano", 100, 200);
    }

    @Test
    public void hasReed() {
        assertEquals(1, saxophone.getReed());
    }

    @Test
    public void hasColour(){
        assertEquals("KennyG suave", saxophone.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("soprano", saxophone.getType());
    }

    @Test
    public void hasPriceWhenBought(){
        assertEquals(100, saxophone.getPriceWhenBought());
    }

    @Test
    public void hasPriceToSell(){
        assertEquals(200, saxophone.getPriceToSell());
    }

    @Test
    public void saxophoneCanPlay(){
        assertEquals("KennyG", saxophone.play());
    }
}
