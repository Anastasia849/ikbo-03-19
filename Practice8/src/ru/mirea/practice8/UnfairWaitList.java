package ru.mirea.practice8;

public class UnfairWaitList <E> extends Waitlist <E>{
    public UnfairWaitList() {
    }
    public void remove(E element){
        content.remove(element);
    }
    public void moveToBack(E element){
        remove(element);
        add(element);
    }
}
