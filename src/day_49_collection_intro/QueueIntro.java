package day_49_collection_intro;

import java.util.PriorityQueue;

public class QueueIntro {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>(); // First In First Out FIFO

        queue.add("d");
        queue.add("a");
        queue.add("b");
        queue.add("c");
        System.out.println(queue);

        String str = queue.poll();
        System.out.println(str);

        //System.out.println(queue.get());
    }
}
