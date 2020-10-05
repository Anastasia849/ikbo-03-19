package ru.mirea.lab9;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try{
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
        }catch (Exception e) {
            System.out.println("Exception");
        }//это не работает никогда
//        catch (NumberFormatException e){
//            System.out.println("Wrong number format");
//        }
        finally {
            System.out.println("it's always shown");
        }
    };
}
