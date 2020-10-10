package ru.mirea.lab3;

public class Dachshund extends Dog{
    private double weight;

    public Dachshund(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    public Dachshund() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+" breed: dachshund weight: "+this.weight;
    }
}
