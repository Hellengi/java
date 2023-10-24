public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp(int i) {
        center.moveUp(i);
    }

    @Override
    public void moveDown(int i) {
        center.moveDown(i);
    }

    @Override
    public void moveLeft(int i) {
        center.moveLeft(i);
    }

    @Override
    public void moveRight(int i) {
        center.moveRight(i);
    }
}
