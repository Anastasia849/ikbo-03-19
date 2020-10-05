package ru.mirea.lab10;


public class GenericClass<E> {
    E[] array;
    //t1
    public GenericClass(E[] array) {
        this.array = array;
    }


    //t3
    public E getElement(int index){
        if(index<0 || index>array.length)
            return null;
        return array[index];
    }
}
