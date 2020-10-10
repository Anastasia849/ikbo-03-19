package ru.mirea.lab7;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList <Integer> arr=new ArrayList<Integer>();
        for(int i =0;i< 10;i++){
            arr.add(i+1);
        }

        System.out.println(arr.get(5));
        arr.set(2,66);
        System.out.println(arr.indexOf(66));
        arr.remove(8);
        ArrayList <Integer> arr1= (ArrayList<Integer>) arr.clone();
        arr.sort(Integer::compareTo);
        System.out.println(arr);
        System.out.println(arr1);
        arr.clear();
        System.out.println(arr);
    }
}
