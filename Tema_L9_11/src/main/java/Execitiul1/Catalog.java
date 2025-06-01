package Execitiul1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Catalog  extends TreeMap<Integer, List<Student>> {
    public Catalog(Comparator<Integer> comparator) {
        super(comparator);
    }

    public void add(Student student) {
        int mediaRotunjita = Math.round(student.getMedie());
        if (mediaRotunjita < 0 || mediaRotunjita > 10) {
            System.out.println("Medie invalidă pentru studentul " + student.getNume() + " cu media " + student.getMedie());
            return;
        }

        this.putIfAbsent(mediaRotunjita, new ArrayList<>()); // creez lista pentru mediaRotunjita, daca nu exista deja
        this.get(mediaRotunjita).add(student);  // adaug studentul la mediaRotunjita
    }
}
