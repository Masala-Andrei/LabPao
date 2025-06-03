package Exercitiul1;

public class Client {
    public static void main(String[] args) {
        Test calc = new Test();
        try {
            calc.add (220.0, null);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            calc.add(Double.MAX_VALUE, 3.0);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            calc.add(-1.0, -Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            calc.divide(52.0, 0.0);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            calc.divide(null, 0.0);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            calc.divide(52.0, -1 / Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            calc.divide(52.0, 1 / Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            calc.average(null);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            calc.average(new Double[]{});
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            Double[] values = Test.readDoublesFromFile("pathgreit.txt");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            Double[] values = Test.readDoublesFromFile("src/main/java/Exercitiul1/input.txt");
            double avg = calc.average(values);
            System.out.println("Media valorilor din fisier este: " + avg);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
