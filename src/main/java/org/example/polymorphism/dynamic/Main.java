package org.example.polymorphism.dynamic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dynamic polymorphism
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println("1.Dog " + "\n" + "2.Cat");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                animal = new Dog();
                animal.speak();
            }
            case 2 -> {
                animal = new Cat();
                animal.speak();
            }
            //Create objects child class on parent reference

            default -> {
                animal = new Animal();
                System.out.println("This choice was invalid");
                animal.speak();
            }

        }
    }
}
