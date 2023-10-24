public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp(int i) {
        y += i;
    }

    @Override
    public void moveDown(int i) {
        y -= i;
    }

    @Override
    public void moveLeft(int i) {
        x -= i;
    }

    @Override
    public void moveRight(int i) {
        x += i;
    }
}
