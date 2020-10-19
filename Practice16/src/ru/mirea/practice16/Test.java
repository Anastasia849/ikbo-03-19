package ru.mirea.practice16;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Item dish01 = new Dish(600.30, "Carbonara", "Type of pasta");
        Item dish02 = new Dish(750.20, " Linguini with clam", "Type of pasta");
        Item drink01 = new Drink(120.00, "Latte", "Type of coffee");
        Item drink02 = new Drink(100.00, "Cappuccino", "Type of coffee");

        Order order01 = new RestaurantOrder();
        order01.add(dish01);
        order01.add(drink01);
        System.out.println("order01:");
        System.out.println(Arrays.toString(order01.getSortedArray()));

        Order order02 = new InternetOrder();
        order02.add(dish02);
        order02.add(drink02);
        System.out.println("order02:");
        System.out.println(Arrays.toString(order02.getSortedArray()));

        InternetOrder order03 = new InternetOrder();
        order03.add("Moscow", order02);
        order03.add("Moscow", drink01);
        System.out.println("order03:");
        order03.getOrders();

        System.out.println(Arrays.toString(order01.getArrayOfNames()));

        order01.add(dish02);
        System.out.println("add item to order01:");
        System.out.println(Arrays.toString(order01.getArrayOfNames()));
        System.out.println("Num of orders in order01: " + order01.numOfOrders());
        System.out.println("Total sum in order01: " + order01.getSumPrice());
        order01.delete("Cappuccino");
        System.out.println(Arrays.toString(order01.getArrayOfNames()));
        order01.add(drink01);
        order01.add(drink01);

        System.out.println(Arrays.toString(order01.getArrayOfNames()));
        System.out.println("deleted: " + order01.deleteAll("Carbonara"));
        System.out.println(Arrays.toString(order01.getArrayOfNames()));
    }
}
