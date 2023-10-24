
public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(size size, int price, String color) {
        super(size, price, color);
        type = "TShirt";
    }

    @Override
    public void dressMan() {

    }
    @Override
    public void dressWoman() {

    }
}