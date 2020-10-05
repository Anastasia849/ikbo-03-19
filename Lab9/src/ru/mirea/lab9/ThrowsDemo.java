package ru.mirea.lab9;

import java.util.Scanner;

public class ThrowsDemo {
//    public void printMessage(String key) {
//        try {
//            String message = getDetails(key);
//            System.out.println(message);
//        }catch (NullPointerException e){
//            System.out.println("there's null");
//        }
//    }
//    public String getDetails(String key) {
//        if(key == null) {
//            throw new NullPointerException( "null key in getDetails");
//        }
//        return "data for " + key;
//    }

    public void getKey()  {
        boolean flag=false;
        do {
            flag=false;
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                e.printStackTrace();
                flag=true;
            }
        }while (flag);
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }


}
