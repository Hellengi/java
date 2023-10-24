public class Rectangle extends Shape{
    public Rectangle(double size) {
        super(size);
        setType("Rectangle");
    }
    @Override
    public double getArea(){
        double h = Math.pow((Math.pow(getSize(), 2)-Math.pow(getSize()/2, 2)), 0.5);
        return getSize()*h/2;
    }
    @Override
    public double getPerimeter(){
        return getSize()*3;
    }
    @Override
    public String getType(){
        return "Rectangle";
    }
    @Override
    public String toString(){
        return "Rectangle, size: " + getSize() + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
