public class Shape {
    public Shape(double size) {
        this.size = size;
    }

    private String type = "";
    private double size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public double getArea(){
        return size;
    }
    public double getPerimeter(){
        return size;
    }
    @Override
    public String toString(){
        return "Shape, size: " + size;
    }
}
