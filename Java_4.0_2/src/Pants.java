
public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(size size, int price, String color) {
        super(size, price, color);
        type = "Pants";
    }
    @Override
    public void dressMan() {

    }
    @Override
    public void dressWoman() {

    }
}