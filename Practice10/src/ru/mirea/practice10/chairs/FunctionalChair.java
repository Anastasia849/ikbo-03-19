package ru.mirea.practice10.chairs;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on the FunctionalChair");
    }
}
