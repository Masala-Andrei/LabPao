package Exercitiul1;

public class Test implements Calculator {
    public Double add(Double a, Double b) throws Exception {
        try {
            return a + b;
        } catch (Exception e) {
            throw Calculator.NullParamaterException;
        }
    }

    public Double divide(Double a, Double b) throws Exception {
        try {
            return a / b;
        } catch (Exception e) {
            throw Calculator.NullParamaterException;
        }
    }

    public Double average(Double[] V) {
        Double mean = 0.0;
        for (Double v : V)
            mean = 0.0;
        return mean / V.length;
    }
}
