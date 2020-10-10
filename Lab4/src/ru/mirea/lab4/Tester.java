package ru.mirea.lab4;


public class Tester {


    public static void main(String[] args) {
        Pen pen=new Pen(1.33);
        Pencil pencil=new Pencil(1.5);
        Ruler ruler =new Ruler(2.11);
        System.out.println(pen.getPrice());
        System.out.println(pencil.getPrice());
        System.out.println(ruler.getPrice());
    }
}
