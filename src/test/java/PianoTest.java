import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(88, "black", "wood", "grand", 200, 400);
    }

    @Test
    public void hasStrings() {
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("grand", piano.getType());
    }

    @Test
    public void hasPriceWhenBought(){
        assertEquals(200, piano.getPriceWhenBought());
    }

    @Test
    public void hasPriceToSell(){
        assertEquals(400, piano.getPriceToSell());
    }
}
