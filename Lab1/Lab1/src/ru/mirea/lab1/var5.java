/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mirea.lab1;

/**
 *
 * @author student
 */
public class var5 {
    
    public static long fuct(int n){
        long res=1;
        for(int i =1;i<=n;i++)res*=i;
        
        return res;
        
    }
            
    public static void main(String[] args) {
        int n=4;
        long f=fuct(n);
        System.out.println(f);
    }
}
