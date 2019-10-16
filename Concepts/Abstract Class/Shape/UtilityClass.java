abstract class Shape {
    String name;
    abstract double getArea();
    public String definiton(){
        return "It belongs to Shape class and Concrete method";
    }
}
class Square extends Shape {
    double side;
    Square(final double s, final String n) {
        super.name=n;
        this.side = s;
    }
    double getArea() {
        return side*side;
    }
}
final class UtilityClass {
    public static void main(String[] args) {
        Square square = new Square(4, "Square");
        System.out.println("Area of Square:"+square.getArea());
        System.out.println("Name:"+square.name);
        System.out.println(square.definiton());
    }
}