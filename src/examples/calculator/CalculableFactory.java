package examples.calculator;

public class CalculableFactory implements ICalculableFactory {
    public ICalculator create(int primaryArg, boolean logFlag) {
        if (logFlag) {
            ICalculator calculator =  new Calculator(primaryArg);
            return new LoggableCalculator(calculator);
        }
        return new Calculator(primaryArg);
    }
}
