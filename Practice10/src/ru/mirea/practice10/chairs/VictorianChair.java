package ru.mirea.practice10.chairs;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on the VictorianChair");
    }
}
