package Instruments;

public class Saxophone extends Instrument {

    private int reed;


    public Saxophone(int reed, String colour, String material, String type, int priceWhenBought, int priceToSell) {
        super(colour, material, type, priceWhenBought, priceToSell);
        this.reed = reed;
    }

    public int getReed() {
        return this.reed;
    }
}
