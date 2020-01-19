import ISell.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<ISell>();
    }

    public int getStockAmount() {
        return stock.size();
    }

    public void addItemToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell items) {
        this.stock.remove(items);
    }
}

