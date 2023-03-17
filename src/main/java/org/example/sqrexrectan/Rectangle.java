package org.example.sqrexrectan;

public class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    protected int calculate(){
        return a*b;
    }
}
