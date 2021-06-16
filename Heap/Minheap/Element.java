package com.example.demo.HeapDataStructure;

public class Element<T>{

    public T value;
    public int Priority;
    public  Element(T value, int priority){
        this.value = value;
        this.Priority=priority;
    }
}
