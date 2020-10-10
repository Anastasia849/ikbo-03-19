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
public class Dog {
    private String name;
    private int age;
    public Dog(){}
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age =age;
    }
    
    public int DogAgeToHumanAge(){
        return this.age*7;
    }
    
    @Override
    public String toString(){
        return this.name+' '+this.age;
    }
    
}
