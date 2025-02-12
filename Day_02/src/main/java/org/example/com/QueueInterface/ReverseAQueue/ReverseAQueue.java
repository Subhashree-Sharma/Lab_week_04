package org.example.com.QueueInterface.ReverseAQueue;
import java.util.*;

public class ReverseAQueue {
    public static <T> void reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();

        //dequeue all elements & push them in stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        //pop elements from the stack & enqueue back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println("Original Queue: " + queue);

        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}

