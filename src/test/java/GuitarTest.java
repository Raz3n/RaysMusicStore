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

    @Test
    public void hasColour(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("electric", guitar.getType());
    }

    @Test
    public void hasPriceWhenBought(){
        assertEquals(50, guitar.getPriceWhenBought());
    }

    @Test
    public void hasPriceToSell(){
        assertEquals(100, guitar.getPriceToSell());
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("It's a song on a guitar", guitar.play());
    }
}
