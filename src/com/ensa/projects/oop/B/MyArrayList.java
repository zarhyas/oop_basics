package com.ensa.projects.oop.B;

public class MyArrayList<T> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public int getSize(){
        return size;
    }

    public void add(T o) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = o;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = java.util.Arrays.copyOf(elements, newSize);
    }
}
