package Exericitul2;

import Exercitiul1.RandomOutTask;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();
        stack.add(new RandomOutTask());
        stack.add(new RandomOutTask());
        stack.remove();
        stack.remove();
        stack.remove();

        queue.add(new RandomOutTask());
        queue.add(new RandomOutTask());
        queue.remove();
        queue.remove();
        queue.remove();
    }
}
