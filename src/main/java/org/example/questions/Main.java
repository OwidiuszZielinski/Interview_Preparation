package org.example.questions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name;
        Person person = new Person();
        person.age =100;
        System.out.println(person);
        Person clone = person.clone();
        System.out.println(clone);

        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            person.age = 20;
            Person personToList = new Person(person);
            list.add(personToList);
        }
        System.out.println(list);

        System.out.println(list);
        {

            // array of size 4.
            int[] arr = new int[10];
            try
            {
                int i = arr[14];
                System.out.print("A" + " ");
            }
            catch(ArrayIndexOutOfBoundsException ex)
            {
                System.out.print("B"+ " ");
            }
            System.out.println("C");
        }
    }

    public static class Person implements Cloneable{
        String name;
        int age;

        public Person() {
        }

        public Person(Person person) {
            this.age = person.age;
            this.name = person.name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public Person clone() {
            try {
                // TODO: copy mutable state here, so the clone can't change the internals of the original
                return (Person) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

}
