package org.example.com.QueueInterface.ImplementAStackUsingQueues;

import java.util.*;

class StackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    //push element onto stack
    public void push(int x) {
        q1.add(x);
    }

    //removes the top element and returns it
    public int pop() {
        if (q1.isEmpty()) throw new NoSuchElementException("Stack is empty");

        //move elements except the last one to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        //last element is the "top"
        int topElement = q1.remove();

        //swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    //get the top element without removing it
    public int top() {
        if (q1.isEmpty()) throw new NoSuchElementException("Stack is empty");

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // Last element is the "top"
        int topElement = q1.peek();
        // Move it to q2
        q2.add(q1.remove());

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    //check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
