
import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<ISell>();
    }

    public int getStockAmount() {
        return stock.size();
    }

    public void addItemToStock(ISell items) {
        this.stock.add(items);
    }

    public void removeItemFromStock(ISell items) {
        this.stock.remove(items);
    }
}

