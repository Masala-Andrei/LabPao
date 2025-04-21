package Exercitiul_2;

public class Form {
    protected String color;

    public float getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return color;
    }

    public Form(String color) {
        this.color = color;
    }

    public Form() {
    }
}
