package data.structure.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

    private List<Integer> arr;

    public MaxHeap(){

        arr = new ArrayList<>();
        arr.add(Integer.MIN_VALUE);
    }

    // worst-case for adding one element in the heap logn (base 2)
    // for n elements O(n) = nlogn
    public void insert (Integer val){

        int index = arr.size();
        int parentIndex;
        boolean keepChecking =false;
        // adding the root node
        if(index == 1){
            arr.add(val);
        }
        else{
            arr.add(index, val);
            parentIndex = index/2;
            if(arr.get(parentIndex) < arr.get(index)){
                keepChecking = true;
            }
            while (keepChecking){
                index = swap(parentIndex, index);
                parentIndex = index/2;
                if(parentIndex ==0 || arr.get(parentIndex)> arr.get(index)){
                    keepChecking = false;
                }
            }
        }
        printArray();
    }

    private Integer swap(Integer parentIndex, Integer childIndex){

        Integer child = arr.get(childIndex);
        arr.set(childIndex, arr.get(parentIndex));
        arr.set(parentIndex, child);

        return parentIndex;
    }

    private void printArray(){
        this.arr.stream().filter(n -> n.intValue() !=Integer.MIN_VALUE).forEach(n ->System.out.print(n+"\t"));
        System.out.println();
    }

    public Integer delete() throws Exception{

        if(arr.size()<=1){
            throw new Exception("The heap is empty");
        }

        Integer deletedRoot = arr.get(1);
        boolean keepLooking = false;
        Integer currentIndex = 1;

        // copy the last element in the root
        arr.set(1, arr.get(arr.size()-1));
        //remove the last index;
        arr.remove(arr.size()-1);
        Integer largestChildIndex = findLargestChildIndex(currentIndex);
        if(largestChildIndex >0 && arr.get(currentIndex) < arr.get(largestChildIndex)){
            keepLooking = true;
        }
        while(keepLooking){
            currentIndex = swap(largestChildIndex, currentIndex);
            largestChildIndex = findLargestChildIndex(currentIndex);
            if(largestChildIndex ==-1 || arr.get(currentIndex) > arr.get(largestChildIndex)){
                keepLooking = false;
            }
        }

        return deletedRoot;
    }

    // return the largest one
    private Integer findLargestChildIndex(Integer parentIndex){

        Integer arraySize = arr.size()-1;

        if(parentIndex*2 > arraySize || (parentIndex*2)+1 > arraySize){
            return -1;
        }
        return arr.get(parentIndex*2)>arr.get((parentIndex*2)+1)?parentIndex*2:(parentIndex*2)+1;
    }
}
