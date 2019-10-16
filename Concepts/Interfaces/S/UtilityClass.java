interface Shape {
    double getArea();
}
interface Angle {
    boolean isRightAngled();
}
class Triangle implements Shape , Angle {
    double base;
    double height;
    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }
    public double getArea() {
        return 0.5 * this.base * this.height;
    }   
    public boolean isRightAngled() {
        return true;
    }
}
final class UtilityClass {
    public static void main(String[] args) {
        Triangle t = new Triangle(6.9, 3.2);
        System.out.println(t.getArea());
        System.out.println(t.isRightAngled());     
    }
}