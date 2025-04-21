package Exercitiul1;

import java.util.Random;

public class RandomOutTask implements Task {
    private int number;
    public RandomOutTask(){
        this.number = new Random().nextInt();
    }
    @Override
    public void execute() {
        System.out.println(number);
    }
}
