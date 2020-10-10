package ru.mirea.practice5;

import java.util.Scanner;

public class Main {
    public static void t12(){
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        if(a!=0){
            if(a%2==1)
                System.out.println(a);
            t12();
        }
    }
    public static void t13(int i)
    {
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        if(a!=0){
            if(i%2==0){
                System.out.println(a);
            }
            t13(i+1);
        }
    }

    public static void t14( int num)
    {
        if(num>0){
            t14(num/10);
            System.out.println(num%10);
        }
    }

    public static void t15(int num){
        if(num>0){
            System.out.println(num%10);
            t14(num/10);
        }
    }

    public static void t16(int max, int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                t16(n, 1);
            } // Шаг рекурсии / рекурсивное условие
            else if (n == max) {
                t16(max, ++count);
            } // Шаг рекурсии / рекурсивное условие
            else {
                t16(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
//	t12();
//	t13(0);
//  t14(23571);
//    t15(56342);
        t16(0,0);
    }
}
