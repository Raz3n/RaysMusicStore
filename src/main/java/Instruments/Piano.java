package Instruments;

public class Piano extends Instrument implements IPlay {

    private int keys;


    public Piano(int keys, String colour, String material, String type, int priceWhenBought, int priceToSell) {
        super(colour, material, type, priceWhenBought, priceToSell);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public String play() {
        return "Piano man";
    }
}
