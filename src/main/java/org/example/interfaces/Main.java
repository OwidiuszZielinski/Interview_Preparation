package org.example.interfaces;

import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Logger logger = new FileLogger();
        logger.log("First behaviour");

        final Logger consoleLogger = new ConsoleLogger();
        consoleLogger.log("Other behaviour");


    }

}
