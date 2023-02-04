package org.example.anonymous;


public class Main {
    public static void main(String[] args) {


        Anon anon = new Anon() {
            @Override
            public void outer() {
                System.out.println("Good this anonymous");
            }
        };
        anon.outer();

        Greeting greeting = new Greeting() {
            public void welcome() {
                System.out.println("YO BRO");
            }

        };
        greeting.welcome();
    }

}
