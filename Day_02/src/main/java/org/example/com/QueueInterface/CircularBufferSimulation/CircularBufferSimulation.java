package org.example.com.QueueInterface.CircularBufferSimulation;

//CircularBufferSimulation class
public class CircularBufferSimulation {
    private int[] buffer;
    private int size, front, rear, count;

    //constructor
    public CircularBufferSimulation(int capacity) {
        buffer = new int[capacity];
        size = capacity;
        front = 0;
        rear = -1;
        count = 0;
    }

    //insert element into circular buffer
    public void insert(int value) {
        //move rear circularly
        rear = (rear + 1) % size;
        buffer[rear] = value;

        if (count < size) {
            //increase count if buffer is not full
            count++;
        } else {
            //move front if overwriting
            front = (front + 1) % size;
        }
    }

    //remove the oldest element
    public int remove() {
        if (count == 0) throw new IllegalStateException("Buffer is empty!");

        int removed = buffer[front];
        //move front circularly
        front = (front + 1) % size;
        count--;
        return removed;
    }

    //display current buffer contents
    public void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBufferSimulation cb = new CircularBufferSimulation(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);
        cb.display();

        cb.remove();
        cb.display();
    }
}
