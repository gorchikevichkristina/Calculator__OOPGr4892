package examples.calculator;

public interface ICalculableFactory {
    ICalculator create(int primaryArg, boolean logFlag);
}
