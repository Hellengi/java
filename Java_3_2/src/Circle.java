public class Circle {
    private Point center;
    private double radius;
    public Circle(double x, double y, double r){
        center = new Point(x, y);
        radius = r;
    }
    public void setCenter(double x, double y){
        center.setX(x);
        center.setY(y);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override public String toString(){
        return center + ", radius: " + radius;
    }
}