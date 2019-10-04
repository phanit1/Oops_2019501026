// interface Shape {
//     String getName();
//     String getAreaFormula();
//     double getArea();
//     int getNoOfSides();
// }
// interface Angle {
//     boolean isRightAngled();
//     boolean isAcuteAngled();
//     boolean isObtuseAngled();
// }
// class Triangle implements Shape , Angle {
//     double base;
//     double height;
//     Triangle(double b, double h) {
//         this.base = b;
//         this.height = h;
//     }
//     public String getName() {
//         return "Triangle";
//     }
//     public String getAreaFormula() {
//         return "1/2 * base * height";
//     }
//     public double getArea() {
//         return 0.5 * this.base * this.height;
//     }
//     public int getNoOfSides() {
//         return 3;
//     }   
//     public boolean isRightAngled() {
//         return true;
//     }
//     public boolean isAcuteAngled() {
//         return true;
//     }
//     public boolean isObtuseAngled() {
//         return true;
//     }
// }
// final class UtilityClass {
//     public static void main(String[] args) {
//         Triangle t = new Triangle(6.9, 3.2);
//         System.out.println(t.getName());
//         System.out.println(t.getArea());
//         System.out.println(t.getAreaFormula());   
//         System.out.println(t.isAcuteAngled());     
//     }
// }
interface Student {
    boolean canThink();
    boolean canLearn();
    boolean canCode();
}
interface Cricketer extends Student {
    boolean canBat();
    boolean canBowl();
    boolean canField();
}
interface RandomGuy extends Cricketer {
    boolean canSmoke();
    boolean canDrink();
}
public class Person implements RandomGuy {
    public boolean canThink() {
        return true;
    }
    public boolean canLearn() {
        return true;
    }
    public boolean canCode() {
        return true;
    }
    public boolean canBat() {
        return true;
    }
    public boolean canBowl() {
        return true;
    }
    public boolean canField() {
        return true;
    }
    public boolean canSmoke() {
        return true;
    }
    public boolean canDrink() {
        return true;
    }
    final class UtilityClass {
        public static void main(String[] args) {
            Person p = new Person();
            System.out.println(p.canLearn());
            System.out.println(p.canBat());
            System.out.println(p.canBowl());   
            System.out.println(p.canCode());     
        }
    }
    
}