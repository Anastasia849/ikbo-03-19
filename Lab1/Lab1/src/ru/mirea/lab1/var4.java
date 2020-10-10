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
public class var4 {
    
  
    public static void main(String[] args) {
       
        
        int[] a;
        a = new int[10];
        
        for(int i=0; i<10;i++){
            a[i]=(int)(Math.random()*100);
            System.out.println(a[i]);
        }
        
        
        for (int i = 1; i  <10; i ++){  //Внешний цикл
        for (int j= 0; j < 10-1; j++){ 
            if(a[j]>a[j+1]){
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
            }
	}
        }
        
        System.out.println();
        for(int i=0; i<10;i++){
            System.out.println(a[i]);
        }
        
        
        
    }
    
    
    
    
}
