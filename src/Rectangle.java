public class Rectangle extends Shape{
    private int width, height;

    public Rectangle(Calculation calculation, int width, int height) {
        super(calculation);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getDimension1() {
        return width;
    }

    @Override
    public int getDimension2() {
        return height;
    }
}
