package Hands_On;

public class Static_NonStatic_Methods {
        double radius;

        // Constructor
        public Static_NonStatic_Methods(double r) {
            radius = r;
        }

        // ✅ Non-static method: needs object state
        public double getArea() {
            return Math.PI * radius * radius;
        }

        // ✅ Static method: does NOT need object state
        public static double calculateArea(double r) {
            return Math.PI * r * r;
        }

        public static void main(String[] args) {
            // Using non-static method (object required)
            Static_NonStatic_Methods c1 = new Static_NonStatic_Methods(5.0);
            System.out.println("Area using non-static method: " + c1.getArea());

            // Using static method (no object needed)
            System.out.println("Area using static method: " + Static_NonStatic_Methods.calculateArea(5.0));
        }
}
