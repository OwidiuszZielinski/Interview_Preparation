package org.example.memory;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    private static void outOfMemoryError() {
        List<byte[]> bytes = new LinkedList<>();
        int index = 1;

        while (true) {
            byte[] b = new byte[10 * 1024 * 1024]; // 10MB byte object
            bytes.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.printf("[%3s] Available heap memory: %s%n" ,index++ ,rt.freeMemory());
        }
    }
}
