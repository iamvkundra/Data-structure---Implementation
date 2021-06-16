package com.example.demo.HeapDataStructure;

import com.example.demo.HeapDataStructure.MAXHEAP.Heap;

public class PQRUN {
    public static  void main(String[] args) throws PriorityException {

        PriorityQueue priorityQueue = new PriorityQueue();
        int arr[] = new int[]{1,2,3,4,5};
        int x = 3;
        int k =3;
        for(int i=0;i<arr.length;i++){
            priorityQueue.insert(arr[i],Math.abs(arr[i] -x));
        }


        for(int i=0;i<4;i++) {
            System.out.println(priorityQueue.getMin());
            priorityQueue.removeMin();

        }
    }
}
