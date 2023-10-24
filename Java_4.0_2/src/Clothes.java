
abstract public class Clothes{
    String type;

    public String getType() {
        return type;
    }
    size size;
    int price;
    String color;
    public Clothes(size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

}