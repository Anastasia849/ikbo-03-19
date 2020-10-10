package ru.mirea.lab4;

public class Pen implements Priceable{
    private double price;

    public Pen(double price) {
        this.price = price;
    }


    @Override
    public double getPrice() {
        return this.price;
    }
}
