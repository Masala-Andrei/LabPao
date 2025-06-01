package Execitiul1;

public class Student {
    String nume;
    float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    public String getNume() {
        return nume;
    }

    public float getMedie() {
        return medie;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Nume "  + nume + " Medie: " + medie;
    }
}
