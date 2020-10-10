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
public class var1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Numbers;
        Numbers = new int[10];
        for(int i =0;i<10;i++)Numbers[i]=i;
        
        int sum=0;
        for(int i =0;i<10;i++) sum+=Numbers[i];
        System.out.println(sum);
        
        sum=0;
        int j=0;
        while(j<10){
        sum+=Numbers[j];
        j++;
        }
        System.out.println(sum);
        
        
        sum=0;
        j=0;
        do{
        sum+=Numbers[j];
        j++;
        }while(j<10);
        System.out.println(sum);
        
      
    } 
}
