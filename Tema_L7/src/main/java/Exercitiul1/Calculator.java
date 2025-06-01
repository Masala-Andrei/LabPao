package Exercitiul1;

public interface Calculator {

    public Double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException;
    public Double divide(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException, MyArithmeticException;
    public Double average(Double[] V) throws NullParameterException, OverflowException, UnderflowException;
}
