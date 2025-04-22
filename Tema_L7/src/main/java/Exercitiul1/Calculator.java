package Exercitiul1;

public interface Calculator {
    Exception NullParamaterException = new Exception("Null parameter");
    Exception OverflowException = new Exception("OverflowException");
    Exception UnderflowException = new Exception("UnderflowException");

    public Double add(Double a, Double b) throws Exception;
    public Double divide(Double a, Double b) throws Exception;
    public Double average(Double[] V);
}
