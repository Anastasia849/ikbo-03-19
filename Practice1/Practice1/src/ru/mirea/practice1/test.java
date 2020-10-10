/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mirea.practice1;

/**
 *
 * @author student
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dog d1;
        d1= new Dog();
        d1.setName("Bill");
        d1.setAge(3);
        System.out.println(d1.DogAgeToHumanAge());
        System.out.println(d1);
        
        Dog d2=new Dog("Tom",5);
        System.out.println(d2.getAge());
        System.out.println(d2.getName());
        
        
        
    }
    
}
