package DataStructures;

import java.util.PriorityQueue;

public class Priority_queue {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(-10);
        priorityQueue.add(10);
        priorityQueue.add(21);
        priorityQueue.add(-1);
        priorityQueue.add(-1);
        priorityQueue.add(5);
        priorityQueue.add(6);
        priorityQueue.add(-1);
        priorityQueue.add(7);
        priorityQueue.add(56);
        priorityQueue.add(-47);
        priorityQueue.add(81);
        System.out.println(priorityQueue);
    }
}
