package org.example.serialization;

import java.io.Serializable;

public class User implements Serializable{

    private String name;
    transient private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name ,String password) {
        this.name = name;
        this.password = password;
    }

    public void sayHello(){
        System.out.println("Hello" + name);
    }

    public static void show(){
        User user = new User("Owi","dupa123");
        user.sayHello();
    }

}
