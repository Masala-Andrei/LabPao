package Exercitiul1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test implements Calculator {
    public Double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if (a == null || b == null)
            throw new NullPointerException("Arguments cannot be null");

        double result = a + b;
        if (result == Double.POSITIVE_INFINITY) {
            throw new OverflowException("Sum generated overflow");
        }

        if (result == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException("Sum generated underflow");
        }

        return result;

    }

    public Double divide(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException, MyArithmeticException {
        if (a == null || b == null) {
            throw new NullParameterException("Arguments cannot be null.");
        }

        if (b == 0.0) {
            throw new MyArithmeticException("Cannot divide with 0");
        }

        double result = a / b;
        if (result == Double.POSITIVE_INFINITY) {
            throw new OverflowException("Division generated overflow");
        }

        if (result == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException("Division generated underflow");
        }

        return a / b;
    }

    public Double average(Double[] V) {
        if (V == null) {
            throw new NullParameterException("Vector cannot be null");
        }

        if (V.length == 0) {
            throw new EmptyArrayException("Vector cannot be empty");
        }

        Double sum = 0.0;
        for (Double value : V) {
            sum = add(sum, value);
        }

        return divide(sum, (double) V.length);
    }

    public static Double[] readDoublesFromFile(String filePath) throws MyFileException {
        List<Double> values = new ArrayList<>();
        File myFile = new File(filePath);
        if (!myFile.exists()) {
            throw new MyFileException("File does not exist");
        }
        try {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                Double data = myReader.nextDouble();
                values.add(data);
                System.out.println(data);
            }
            myReader.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return values.toArray(new Double[0]);
    }
}
