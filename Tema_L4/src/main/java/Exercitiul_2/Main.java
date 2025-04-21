package Exercitiul_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Form> Forms = new ArrayList<Form>();
        Forms.add(new Circle(10, "rosu"));
        Forms.add(new Triangle(5, 2, "rosu"));
        Forms.add(new Circle(15, "albastru"));
        Forms.add(new Circle(5, "verde"));
        Forms.add(new Triangle(6, 5, "galben"));
        Forms.add(new Triangle(3, 4, "albastru"));
        Forms.add(new Circle(7, "galben"));
        Forms.add(new Triangle(7, 8, "verde"));
        for (Form form : Forms)
            System.out.println(form.toString());

        System.out.println("\n\n");

        for (Form form : Forms) {
            if (form instanceof Circle)
                ((Circle) form).printCircleDimensions();
            if (form instanceof Triangle)
                ((Triangle) form).printTriangleDimensions();
        }

        for (Form form : Forms) {
            if (form instanceof Circle)
                ((Circle) form).printCircleDimensions();
            if (form instanceof Triangle)
                ((Triangle) form).printTriangleDimensions();
        }

        System.out.println("\n\n");

        for (Form form : Forms) {
            try
            {
                Circle circle = (Circle) form;
                circle.printCircleDimensions();
            }catch (ClassCastException e){
                Triangle triangle = (Triangle) form;
                triangle.printTriangleDimensions();
            }
        }
    }
}
