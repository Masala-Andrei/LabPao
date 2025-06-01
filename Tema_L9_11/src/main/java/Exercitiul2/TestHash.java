package Exercitiul2;

import java.util.Collection;
import java.util.HashSet;

public class TestHash extends HashSet<Integer> {
    private int contor = 0;

    @Override
    public boolean add(Integer i) {
        contor++;
        return super.add(i);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
//        contor += c.size();
        return super.addAll(c);
    }

    public int getContor() {
        return contor;
    }
}
