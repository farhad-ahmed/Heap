package data.structure.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

    private List<Integer> arr;

    public MaxHeap(){

        arr = new ArrayList<>();
        arr.add(Integer.MIN_VALUE);
    }

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
            parentIndex = getParentIndex(index);
            if(arr.get(parentIndex) < arr.get(index)){
                keepChecking = true;
            }
            while (keepChecking){
                index = swap(parentIndex, index);
                parentIndex = getParentIndex(index);
                if(parentIndex ==0 || arr.get(parentIndex)> arr.get(index)){
                    keepChecking = false;
                }
            }
        }
        printArray();
    }

    private Integer getParentIndex(Integer index){

        if(index%2==0){
            return index/2;
        }
        else{
            return (index-1)/2;
        }
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


}
