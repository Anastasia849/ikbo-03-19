package ru.mirea.lab4;

public class Ruler implements Priceable {
    private double price;

    public Ruler(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
