package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NewList<E> {

    List<E> list;

    public NewList() {
        list = new ArrayList<>();
    }


    //t1
    public List<E> convertArrayToList(E[] arr){
        list.addAll(Arrays.asList(arr));
        return list;
    }


    //t4
    public void printFirstFiveElements(){
        try {
            for(int i=0;i<5;i++){
                System.out.println(list.get(i));
            }
        }catch (IndexOutOfBoundsException e){
            System.err.println("There's not enough elements");
        }
    }

    public void convertCatalogToList(Collection <E> collection){
        list.addAll(collection);
    }

    public void task4(Collection<E> collection){
        convertCatalogToList(collection);
        printFirstFiveElements();
    }


}
