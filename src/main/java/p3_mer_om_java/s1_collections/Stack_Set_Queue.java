package p3_mer_om_java.s1_collections;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Stack_Set_Queue {

    public static void completeTask(Queue<Integer> tasks) {
        System.out.println("Now doing task " + tasks.poll());
    }

    public static void eatPancakes(Stack<Integer> pancakes) {
        System.out.println("Now eating pancake number " + pancakes.pop());
    }

    public static void main(String[] args) {

        Set<String> participants = new HashSet<>();

        participants.add("Otto");
        participants.add("Anne");
        participants.add("Anne");

        System.out.println(participants);

        Queue<Integer> tasks = new PriorityQueue<>();
        tasks.add(1);
        tasks.add(2);
        tasks.add(3);

        completeTask(tasks);
        completeTask(tasks);
        completeTask(tasks);

        Stack<Integer> pancakes = new Stack<>();
        pancakes.push(1);
        pancakes.push(2);
        pancakes.push(3);

        eatPancakes(pancakes);
        eatPancakes(pancakes);
        eatPancakes(pancakes);

    }

}
