public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp(int i) {
        topLeft.moveUp(i);
        bottomRight.moveUp(i);
    }

    @Override
    public void moveDown(int i) {
        topLeft.moveDown(i);
        bottomRight.moveDown(i);
    }

    @Override
    public void moveLeft(int i) {
        topLeft.moveLeft(i);
        bottomRight.moveLeft(i);
    }

    @Override
    public void moveRight(int i) {
        topLeft.moveRight(i);
        bottomRight.moveRight(i);
    }

    public boolean sameSpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
}
