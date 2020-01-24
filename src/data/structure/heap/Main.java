package data.structure.heap;

public class Main {

    public static void main(String[] args) {

        //testCase1();
        //testCase2();
        testCase3();
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

    private static void testCase3() {
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
        //System.out.println("Removed " + maxHeap.delete());

    }
}
