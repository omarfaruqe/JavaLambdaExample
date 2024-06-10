public class Runner {
    public static void main(String[] args) {
        // Create a rectangle with width 5 and height 10, and calculate its area
        Calculation areaCalculation = (a, b) -> a * b;
        Rectangle rectangle = new Rectangle(areaCalculation, 5, 10);
        System.out.println("Rectangle area: " + rectangle.calculateResult());

        // Create a circle with radius 7, and calculate its circumference
        Calculation circumferenceCalculation = (a, b) -> 2 * (int) (Math.PI * a);
        Circle circle = new Circle(circumferenceCalculation, 7);
        System.out.println("Circle circumference: " + circle.calculateResult());
    }
}
