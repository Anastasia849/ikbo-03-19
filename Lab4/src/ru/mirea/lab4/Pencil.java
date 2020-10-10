package ru.mirea.lab4;

public class Pencil implements Priceable {
    private double price;

    public Pencil(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
