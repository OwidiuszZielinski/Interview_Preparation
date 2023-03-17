package org.example.inheritance;

public class Main {

    public static void main(String[] args) {
        String x = new String("a");
        String b = new String("a");
        String c = "a";
        String d = "a";
        System.out.println(x==b);
        System.out.println(x==c);
        System.out.println(c==d);

        System.out.println(b.hashCode());
        System.out.println(x.equals(b));

        TheCityOfHero person = new Person("OWIDIUSZ",27,"MARCINKOW");
        person.printCity();
        TheCityOfHero hero = new Hero("BATMAN",15,"WATER","SILESIA");
        hero.printCity();

        System.out.println(hero instanceof TheCityOfHero);
    }
}
