package ru.mirea.lab2;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle(3.7);
        c1.setRadius(1.8);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getSquare());
        System.out.println(c1);
    }
}
