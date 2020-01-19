import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//naming issue Items instead of item, could put in a package for naming conventions.

public class ItemsTest {

    Items item;
    Items item2;

    @Before
    public void before(){
        item = new Items("Guitar strings", 10, 20);
        item2 = new Items("Sheet music", 5, 10);
    }

    @Test
    public void hasType(){
        assertEquals("Guitar strings", item.getType());
    }

    @Test
    public void hasPriceWhenBought(){
        assertEquals(5, item2.getPriceWhenBought());
    }

    @Test
    public void hasPriceToSell(){
        assertEquals(10, item2.getPriceToSell());
    }

    @Test
    public void itemHasMarkUp(){
        assertEquals(5, item2.markUp());
    }


}
