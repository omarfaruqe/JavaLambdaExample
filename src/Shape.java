public abstract class Shape{
    private Calculation calculation;

    public Shape(Calculation calculation){
        this.calculation = calculation;
    }

    public abstract int getDimension1();
    public abstract int getDimension2();

    public int calculateResult(){
        return calculation.calculate(getDimension1(), getDimension2());
    }
}
