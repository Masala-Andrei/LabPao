package Execitiul1;

import java.util.Comparator;

public class ComparatorMedie implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b.compareTo(a); // descrescator
    }

}
