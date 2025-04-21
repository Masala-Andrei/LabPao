package Exercitiul_2;

public class Triangle extends Form {
    private float height, base;

    public Triangle() {
    }

    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return height * base / 2;
    }

    public String toString() {
        return
                "Triunghi: " +
                super.toString() + " " +
                this.getArea();
    }

    // 2 triunghiuri sunt echivalente daca au aceeasi arie
    public boolean equals(Triangle triangle) {
        return this.getArea() == triangle.getArea();
    }

    public void printTriangleDimensions(){
        System.out.println("Triangle: Height " + height + " Base " + base);
    }
}
