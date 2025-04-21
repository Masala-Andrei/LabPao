package Exercitiul_2;
import java.lang.Math.*;

public class Circle extends Form {
    private float radius;

    public Circle() {
    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    public float getArea(){
        return radius * radius * (float)Math.PI;
    }

    @Override
    public String toString() {
        return
                "Cerc: " +
                super.toString() + " " +
                this.getArea();
    }

    public void printCircleDimensions(){
        System.out.println("Circle: Radius " + radius);
    }
}
