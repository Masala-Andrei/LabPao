package Exericitul2;

import Exercitiul1.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Stack implements Container {
    Task[] taskStack = new Task[0];

    public void add(Task task) {
        taskStack = Arrays.copyOf(taskStack, taskStack.length + 1);
        taskStack[taskStack.length - 1] = task;
    }

    public void remove() {
        if(taskStack.length == 0){
            System.out.println("Stack is empty");
        }else{
            taskStack = Arrays.copyOf(taskStack, taskStack.length - 1);
        }
    }
}
