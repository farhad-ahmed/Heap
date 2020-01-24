package data.structure.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {

        //testCase1();
        //testCase2();
        //testCase3();
        testCase4();
    }

    private static void testCase1() {
        MaxHeap maxHeap = new MaxHeap();

        maxHeap.insert(2);
        maxHeap.insert(8);
        maxHeap.insert(1);

        maxHeap.insert(6);
        maxHeap.insert(2);
        maxHeap.insert(0);

        maxHeap.insert(7);
        maxHeap.insert(0);
        maxHeap.insert(1);
        maxHeap.insert(8);
    }

    private static void testCase2() {
        MaxHeap maxHeap = new MaxHeap();

        maxHeap.insert(30);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(5);
        maxHeap.insert(10);
        maxHeap.insert(12);
        maxHeap.insert(6);
        maxHeap.insert(40);
        maxHeap.insert(35);
    }

    private static void testCase3() throws Exception{
        MaxHeap maxHeap = new MaxHeap();

        maxHeap.insert(40);
        maxHeap.insert(35);
        maxHeap.insert(30);
        maxHeap.insert(15);
        maxHeap.insert(10);
        maxHeap.insert(25);
        maxHeap.insert(5);

        System.out.println("Removed " + maxHeap.delete());
        System.out.println("Removed " + maxHeap.delete());
        System.out.println("Removed " + maxHeap.delete());
        System.out.println("Removed " + maxHeap.delete());
        System.out.println("Removed " + maxHeap.delete());
        System.out.println("Removed " + maxHeap.delete());
        System.out.println("Removed " + maxHeap.delete());
        System.out.println("Removed " + maxHeap.delete());
    }

    private static void testCase4() throws Exception{

        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(40);
        priorityQueue.add(35);
        priorityQueue.add(30);
        priorityQueue.add(15);
        priorityQueue.add(10);
        priorityQueue.add(25);
        priorityQueue.add(5);

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        //System.out.println(priorityQueue.remove());
    }
}
