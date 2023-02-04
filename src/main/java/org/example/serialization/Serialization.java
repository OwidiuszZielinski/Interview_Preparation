package org.example.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Serialization {
    public static void main(String[] args) {

        User user = new User("Bro","I<3Pizza");
        user.sayHello();

        User.show();

        Object ob = (Object) user;
        ob.notify();


        try {
            FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
            System.out.println("Object info saved ! ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}
