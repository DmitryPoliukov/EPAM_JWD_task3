package by.epamtc.poliukov.task03.task1.inputData;

import by.epamtc.poliukov.task03.task1.wrapper.Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputData {
    Scanner scanner = new Scanner(System.in);

    public void fillFromConsole(Array array) {
        for(int i = 0; i < array.getLength(); i++) {
            int number = intScanner(String.format("Enter element №%d", i + 1));
            array.setElement(number);
        }
    }

    private int intScanner(String message) {
        int number;
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Incorrect input");
            System.out.println(message);
        }
        number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public void fillRandom(Array array) {
        for(int i = 0; i < array.getLength(); i++) {
            int number = (int) ((Math.random() * Integer.MAX_VALUE) + Integer.MIN_VALUE / 2);
            array.setElement(number);
        }
    }

    public void fillFromFile(Array array) {
        File file = new File(".\\2\\src\\by\\epamtc\\poliukov\\task03\\task1\\resources\\forFilling.txt");
        try {
            Scanner fileScanner = new Scanner(file);
            for(int i = 0; i < array.getLength(); i++) {
                int number = fileScanner.nextInt();
                array.setElement(number);
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}
