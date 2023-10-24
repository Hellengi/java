public class Square extends Rectangle{

    Square(){

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
