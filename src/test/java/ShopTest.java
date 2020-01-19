import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Saxophone saxophone;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar(6, "brown", "wood", "electric", 50, 100);
        piano= new Piano(88, "black", "wood", "grand", 200, 400);
        saxophone= new Saxophone(1, "green", "brass", "alto", 100, 200);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getStockAmount());
    }

    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStockAmount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.removeItemFromStock((piano);
        assertEquals(0, shop.getStockAmount());
    }
}
