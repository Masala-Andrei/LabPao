package Exercitiul2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TestHash set = new TestHash();
        TestLinkedList list = new TestLinkedList();

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(45);

        set.add(5);
        set.add(6);
        set.add(7);
        set.add(7);
        set.addAll(lista);
        System.out.println(set);
        System.out.println(set.getContor());
        // addAll din HashSetcheama metoda add, de aceea cand adaug o lista, contorul va creste cu dublul size-ului listei
        // Asadar, in metoda addAll nu mai fac contor += c.size()


        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.addAll(lista);
        System.out.println(list);
        System.out.println(list.getContor());
        // Metoda addAll din LinkedList pe de alta parte, nu cheama metoda add, asa ca trebuie adunata de mana marimea lisei
        // In plus, LinkedList permite duplicate in structura, in timp ce HashSet nu permite


    }
}
