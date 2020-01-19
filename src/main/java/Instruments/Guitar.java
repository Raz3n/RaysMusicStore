package Instruments;

public class Guitar extends Instrument implements IPlay{

    private int strings;


    public Guitar(int strings, String colour, String material, String type, int priceWhenBought, int priceToSell) {
        super(colour, material, type, priceWhenBought, priceToSell);
        this.strings = strings;
    }

    public int getStrings(){
        return strings;
    }

    public String play() {
        return "It's a song on a guitar";
    }

}
