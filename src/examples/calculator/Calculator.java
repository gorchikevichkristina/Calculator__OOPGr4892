package examples.calculator;

public final class Calculator implements ICalculator {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public ICalculator sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public ICalculator multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}
