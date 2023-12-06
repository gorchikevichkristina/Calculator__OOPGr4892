package examples.calculator;

public class CalcLogger implements Loggable {
    @Override
    public void log(String str) {
        System.out.println("Log message: " + str);
    }
}
