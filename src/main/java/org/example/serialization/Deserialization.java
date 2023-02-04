package org.example.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {

        User user;
        try {
            FileInputStream fileIn = new FileInputStream("userInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Object info read ! ");
            System.out.println(user.getName());
            System.out.println(user.getPassword());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
