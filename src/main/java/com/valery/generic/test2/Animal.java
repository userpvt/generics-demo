package com.valery.generic.test2;

public class Animal {

    private int id;

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
