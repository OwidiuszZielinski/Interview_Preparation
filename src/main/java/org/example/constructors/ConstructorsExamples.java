package org.example.constructors;

public class ConstructorsExamples {
    private int age;
    private int id;
    private String name;
    private String address;

    public ConstructorsExamples(int age) {
        this.age = age;
    }

    public ConstructorsExamples(int age ,int id ,String address) {
        this(age);
        this.id = id;
        this.address = address;
    }

    public ConstructorsExamples(int age ,int id ,String address ,String name) {
        this(age ,id ,address);
        this.name = name;
    }

    public ConstructorsExamples() {
    }

    public ConstructorsExamples(ConstructorsExamples constructorsExamplesCopy){
        this.age = constructorsExamplesCopy.age;
    }
}
