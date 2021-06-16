package com.example.demo.HeapDataStructure.MAXHEAP;

import com.example.demo.HeapDataStructure.PriorityException;

import java.util.ArrayList;

public class Heap<T> {

    private ArrayList<Integer> heap;
    public Heap(){
        this.heap = new ArrayList<>();
    }
    public void insert(int value){
        heap.add(value);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;
        while (childIndex >0) {
            if (heap.get(childIndex) > heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    public void removeMax() throws PriorityException{
        if (isEmpty()){
            throw new PriorityException();
        }
        int removed = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int parentIndex =0;
        int leftChild= (2*parentIndex)+1;
        int rightChild = (2*parentIndex)+2;
        while(leftChild < heap.size()) {
            int maxIndex = parentIndex;
            if (heap.get(leftChild) > heap.get(parentIndex)) {
                maxIndex = leftChild;
            }
            if (heap.get(rightChild) > heap.get(maxIndex)) {
                maxIndex = rightChild;
            }
            if (maxIndex == parentIndex) {
                break;
            }
            int element = heap.get(maxIndex);
            heap.set(maxIndex,heap.get(parentIndex));
            heap.set(parentIndex,element);
            parentIndex = maxIndex;
            leftChild=(2*parentIndex)+1;
            rightChild = (2*parentIndex)+2;
        }
    }

    public int getMax() throws PriorityException {
        if(isEmpty()) throw new PriorityException();
        return heap.get(0);

    }
    public int size(){
        return heap.size();
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public static  void main(String[] args) throws PriorityException {

        Heap heap = new Heap();
        heap.insert(20);
        heap.insert(300);
        heap.insert(400);
        heap.insert(100);
        System.out.println(heap.getMax());
        heap.removeMax();
        System.out.println(heap.getMax());
    }
}
