package com.aca;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Haf-Haf");
    }
    @Override
    public void eat() {
        System.out.println("Dog is eating meat");
    }
}
