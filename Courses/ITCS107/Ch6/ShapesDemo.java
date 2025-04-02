class Circle {
    double radius = 0.0;
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public double sectorArea(double angle) {
        return (angle / 360) * area();
    }
}

class Rectangle {
    double length = 0.0;
    double width = 0.0;
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle {
    double sideA = 0.0;
    double sideB = 0.0;
    double sideC = 0.0;
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

public class ShapesDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2.3;
        System.out.println("Circle:");
        System.out.println("The area is " + c1.area());
        System.out.println("The perimeter is " + c1.perimeter());
        System.out.println("The sector area is " + c1.sectorArea(90));
        Rectangle r1 = new Rectangle();
        r1.length = 1.4;
        r1.width = 2.3;
        System.out.println("Rectangle:");
        System.out.println("The area is " + r1.area());
        System.out.println("The perimeter is " + r1.perimeter());
        Triangle t1 = new Triangle();
        t1.sideA = 2.3;
        t1.sideB = 3.4;
        t1.sideC = 1.2;
        System.out.println("Triangle:");
        System.out.println("The area is " + t1.area());
        System.out.println("The perimeter is " + t1.perimeter());
    }
}