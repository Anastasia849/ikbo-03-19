package ru.mirea.practice8;

public class BoundedWaitList <E> extends Waitlist<E>{
    private int capacity;



    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if(this.content.size()<this.capacity)
            super.add(element);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
