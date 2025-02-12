package org.example.com.QueueInterface.GenerateBinaryNumbersUsingAQueue;
import java.util.*;

public class GenerateBinaryNumbers {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        //start with 1
        queue.add("1");

        for (int i = 0; i < N; i++) {
            //dequeue the front binary number
            String current = queue.remove();
            //store in result
            result.add(current);

            //generate next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(generateBinaryNumbers(N));
    }
}
