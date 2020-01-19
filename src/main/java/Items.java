public class Items implements ISell{

    private String type;
    private int priceWhenBought;
    private int priceToSell;

    public Items(String type, int priceWhenBought, int priceToSell) {
        this.type = type;
        this.priceWhenBought = priceWhenBought;
        this.priceToSell = priceToSell;
    }

    public String getType() {
        return type;
    }

    public int getPriceWhenBought() {
        return priceWhenBought;
    }

    public int getPriceToSell() {
        return priceToSell;
    }

    public int markUp() {
        return priceToSell -= priceWhenBought;
    }
}
