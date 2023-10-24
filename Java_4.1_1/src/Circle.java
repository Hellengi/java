public class Circle extends Shape{
    public Circle(double size) {
        super(size);
        setType("Circle");
    }

    @Override
    public double getArea(){
        return getSize()*getSize()*3.14;
    }
    @Override
    public double getPerimeter(){
        return getSize()*2*3.14;
    }
    @Override
    public String getType(){
        return "Circle";
    }
    @Override
    public String toString(){
        return "Circle, size: " + getSize() + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
