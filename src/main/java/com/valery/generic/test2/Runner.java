package com.valery.generic.test2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(1));
        listOfDogs.add(new Dog(2));

        test(listOfDogs);
        test(listOfAnimal);

    }
//говорит листу чтобы дал все значения из класса Анимал и остальных классов ,которые его наследуют
    //List<? super Animal> list - говорит что хочет видеть всех родителей класса Animal
    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }

    /*private static void test(List<Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }*/
    }
}
