public class myRunner {
    public static void main(String[] args) {
        // Existing Circle code...

        System.out.println("\n--------Test Rectangle-------");
        Rectangle r1 = new Rectangle(1, 1, 5, 3);
        System.out.println("Area of Rectangle: " + r1.getArea());
        System.out.println("Initial coordinates: " + r1.getCoordinate());
        r1.moveRight();
        r1.moveDown();
        System.out.println("After moving right and down: " + r1.getCoordinate());

        System.out.println("\n--------Test Triangle-------");
        Triangle t1 = new Triangle(0, 0, 4, 3);
        System.out.println("Area of Triangle: " + t1.getArea());
        System.out.println("Initial coordinates: " + t1.getCoordinate());
        t1.moveUp();
        t1.moveLeft();
        System.out.println("After moving up and left: " + t1.getCoordinate());

        System.out.println("\n--------Test Polymorphism-------");
        Movable r2 = new Rectangle(2, 2, 3, 4);  // upcast
        r2.moveUp();
        System.out.println("Rectangle after move up: " + r2.getCoordinate());

        Movable t2 = new Triangle(5, 5, 2, 2);  // upcast
        t2.moveLeft();
        System.out.println("Triangle after move left: " + t2.getCoordinate());
    }
}