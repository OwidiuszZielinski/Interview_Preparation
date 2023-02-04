package org.example.singleton;

public class SingletonExample {

    private String x;
    private static SingletonExample INSTANCE;

    //Hidden constructor
    private SingletonExample(){

    }

    public static SingletonExample getInstance(){
        if(INSTANCE==null){
            INSTANCE = new SingletonExample();
        }
        return INSTANCE;
    }
}
