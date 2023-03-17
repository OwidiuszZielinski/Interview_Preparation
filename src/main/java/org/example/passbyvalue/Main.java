package org.example.passbyvalue;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.age = 2;

        System.out.println("BEFORE: " + animal.age);

        changeRef(animal);

        System.out.println("AFTER: " + animal.age);

        String name = "Owi";

        System.out.println("BEFORE: " + name);

        changeString(name);

        System.out.println("AFTER: " + name);

        int primitive = 5;

        System.out.println("BEFORE: " + primitive);

        changePrim(primitive);

        System.out.println("AFTER: " + primitive);

        System.out.println("BEFORE: " + animal.age);

        foo(animal);

        System.out.println("AFTER: " + animal.age);


    }

    //Method 1
    private static void changeRefWithNew(Animal animalCopy) {
        Animal animal = new Animal();
        animal.age = 12;
    }
    //Method 2
    private static void changeRef(Animal animalCopy) {
        animalCopy.age = 12;
    }

    //Method 3
    private static void changePrim(int x) {
        x = 12;
    }
    //Method 4
    private static void changeString(String x) {
        x = "Ela";
    }

    private static void foo(Animal animal){
        animal.setAge(20);
    }
}
