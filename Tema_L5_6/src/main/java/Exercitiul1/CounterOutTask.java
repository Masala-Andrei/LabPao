package Exercitiul1;

public class CounterOutTask implements Task{
    private static int counter = 0;

    public void execute(){
        System.out.println(++counter);
    }

}
