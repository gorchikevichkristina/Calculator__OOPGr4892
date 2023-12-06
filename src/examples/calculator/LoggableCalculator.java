package examples.calculator;

public class LoggableCalculator implements ICalculator {

    protected ICalculator calc;
    Loggable calcLogger = new CalcLogger();

    public LoggableCalculator(ICalculator calc) {
        calcLogger.log("" + calc.getResult());
        this.calc = calc;
    }


    @Override
    public ICalculator sum(int arg) {
        calcLogger.log(calc.getResult() + " + " + arg);
        return this.calc.sum(arg);
    }

    @Override
    public ICalculator multi(int arg) {
        calcLogger.log(calc.getResult() + " * " + arg);
        return this.calc.multi(arg);
    }

    @Override
    public int getResult() {
        int result = this.calc.getResult();
        calcLogger.log(" = " + result);
        return this.calc.getResult();
    }
}
