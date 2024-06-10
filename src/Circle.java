public class Circle extends Shape{
    private int radius;

    public Circle(Calculation calculation, int radius) {
        super(calculation);
        this.radius = radius;
    }

    @Override
    public int getDimension1() {
        return 0;
    }

    @Override
    public int getDimension2() {
        return 0;
    }
}
