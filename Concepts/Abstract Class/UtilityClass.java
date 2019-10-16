abstract class Shape {
    String name;
    Shape(String name) {
        this.name = name;
    }
    // public String definition() {
    //     return "I belong to a shape, I am inherinting class Shape";
    // }
    abstract String getAreaFormula();
    abstract double getArea();
    abstract int getNoOfSides();
}
class Square extends Shape {
    double side;
    // String name; inherits from shape class by default.
    Square(final double s, final String n) {
        super(n);
        this.side = s;
    }
    
    String getAreaFormula() {
        return "side*side";
    }
    double getArea() {
        return side*side;
    }
    int getNoOfSides() {
        return 4;
    }
}
class Circle extends Shape {
    double radius;
    double pi =3.14;
    // String name; inherits from shape class by default.
    Circle(final double r, final String n) {
        super(n);
        this.radius = r;
    }
    
    String getAreaFormula() {
        return "pi*r*r";
    }
    double getArea() {
        return pi * radius * radius;
    }
    int getNoOfSides() {
        return 0;
    }
}
class Rectangle extends Shape {
    double l;
    double b;
    Rectangle (final double length, final double breadth, final String n) {
        super(n);
        this.l = length;
        this.b = breadth;
    }
    String getAreaFormula() {
        return "length*breadth";
    }
    double getArea() {
        return l*b;
    }
    int getNoOfSides() {
        return 4;
    }
}

final class UtilityClass {
    public static void main(String[] args) {
        Square square = new Square(4, "Square");
        System.out.println("Area of Square:"+square.getArea());
        System.out.println("Sides:"+square.getNoOfSides());
        Circle circle = new Circle(5, "Circle");
        System.out.println("Area of Circle:"+circle.getArea());
        System.out.println("Sides:"+circle.getNoOfSides());
        Rectangle rect = new Rectangle (4,7,"Rectangle");
        System.out.println("Area of Rectangle:"+rect.getArea());
        System.out.println("Sides:"+rect.getNoOfSides());
      
    }
}