package org.example.interfaces;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    @Override
    public void log(String text) {
        try {
            File file = new File("logi.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(text + "\n");
            fw.close();
        } catch (IOException e) {

        }

    }
}
