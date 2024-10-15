public class Triangle extends Shape implements Movable {
    private int x, y;   // x and y coordinates of the top vertex

    public Triangle(int x, int y, double base, double height) {
        this.x = x;
        this.y = y;
        super.base = base;
        super.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Triangle with base " + this.base + " and height " + this.height);
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }

    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}