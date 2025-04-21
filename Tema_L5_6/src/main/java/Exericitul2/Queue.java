package Exericitul2;

import Exercitiul1.Task;

import java.util.Arrays;

public class Queue implements Container {
    Task[] taskQueue = new Task[0];
    public void add(Task task) {
        taskQueue = Arrays.copyOf(taskQueue, taskQueue.length);
        taskQueue[taskQueue.length - 1] = task;
    }

    public void remove() {
        if(taskQueue.length == 0)
            System.out.println("Queue is empty");
        else
            taskQueue = Arrays.copyOfRange(taskQueue,1, taskQueue.length);

    }
}
