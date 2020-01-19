package Instruments;

public abstract class Instrument {

    private String colour;
    private String material;
    private String type;
    private int priceWhenBought;
    private int priceToSell;


    public Instrument(String colour, String material, String type, int priceWhenBought, int priceToSell) {
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.priceWhenBought = priceWhenBought;
        this.priceToSell = priceToSell;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
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
}
