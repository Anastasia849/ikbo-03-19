package ru.mirea.practice16;

public class Test {
    public static void main(String[] ar) {
        OrderManager om = new OrderManager();
        RestaurantOrder ro = new RestaurantOrder();
        InternetOrder io = new InternetOrder();

        try {
            Drink drink1 = new Drink("Latte", "0.2", 150);
            Drink drink2 = new Drink("Cappuccino", "0.2", 120);
            Dish dish1 = new Dish("Carbonara", "pasta", 600);
            Dish dish2 = new Dish("Linguini", "pasta", 800);
            ro.add(drink1);
            io.add(dish1);
            io.add(drink2);
            ro.add(dish2);
            ro.add(dish2);
            ro.add(dish1);
            om.add(1, ro);
            om.add(2,ro);
            om.add("Moscow",io);
            System.out.println(ro.CostTotal());
            System.out.println(om.RestaurantOrdersCostSummary());
            System.out.println(ro.dishQuantity());
            System.out.println(ro.dishQuantity("Linguini"));
            System.out.println(io.getSize());
            System.out.println(io.CostTotal());
            io.remove("Cappuccino");
            System.out.println(io.getSize());
            System.out.println(io.CostTotal());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
