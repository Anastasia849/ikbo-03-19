package ru.mirea.lab2;

public class Circle {

    private double radius=0.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle\nradius "+this.radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI*this.radius;
    }
    public double getSquare(){
        return Math.PI*this.radius*this.radius;
    }
}
