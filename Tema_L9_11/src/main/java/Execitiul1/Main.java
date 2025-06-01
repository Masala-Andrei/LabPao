package Execitiul1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog(new ComparatorMedie());

        catalog.add(new Student("Andrei", 9.75f));
        catalog.add(new Student("Bogdan", 8.45f));
        catalog.add(new Student("Ioana", 8.5f));
        catalog.add(new Student("Daria", 6.9f));
        catalog.add(new Student("Ana", 6.6f));
        catalog.add(new Student("Vlad", 9.3f));
        catalog.add(new Student("Cristina", 7.7f));
        catalog.add(new Student("Mihai", 12.9f));

        for (var aux: catalog.entrySet()) {
            System.out.println();
            List<Student> listaStudenti = aux.getValue();
            System.out.println(aux.getKey());
            System.out.println("============ Inainte de sortare ============");
            for(var student : aux.getValue()) {
                System.out.println(student);
            }
            System.out.println("============ Dupa sortare ============");
            listaStudenti.sort(Comparator.comparing(Student::getNume));
            for (Student student : listaStudenti) {
                System.out.println(student);
            }
        }
    }
}
