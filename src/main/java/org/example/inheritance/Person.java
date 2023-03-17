package org.example.inheritance;

public class Person extends TheCityOfHero{
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name ,int age ,String city){
        super(city);
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "\n" + this.age + "\n" + super.city + "\n";
    }

    @Override
    protected void printCity() {
        System.out.println("SECOND CLASS " + city);
    }
}
