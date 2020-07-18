package com.valery.generic.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("pig");
//Здесь объекты типа строки и поэтому в видимости стоят все индексы
        String animal = animals.get(1);
        System.out.println(animal);
    }

    private static void java5() {
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("pig");
//Java 5 , чтобы вызвать эти объекты требуется спуститься по иерархии ниже, не совсем удобно + объекты могут любого типа храниться
        String animal = (String) animals.get(1);
        System.out.println(animal);
    }
}
