package ru.mirea.practice3;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
        this.length=side;
        this.width=side;
    }

    @Override
    public String toString() {
        return "Square side: "+this.length;
    }
}
