public class Square extends Shape{
    public Square(double size) {
        super(size);
        setType("Square");
    }
    @Override
    public double getArea(){
        return getSize()*getSize();
    }
    @Override
    public double getPerimeter(){
        return getSize()*4;
    }
    @Override
    public String getType(){
        return "Square";
    }
    @Override
    public String toString(){
        return "Square, size: " + getSize() + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
