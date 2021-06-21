package by.epamtc.poliukov.task03.task1.inputData;

import by.epamtc.poliukov.task03.task1.exception.NonValidArrayException;
import by.epamtc.poliukov.task03.task1.wrapper.Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputData {
    Scanner scanner = new Scanner(System.in);

    public void fillFromConsole(Array array) {
        int[] data = array.getData();
        for(int i = 0; i < data.length; i++) {
            data[i] = intScanner(String.format("Enter element №%d", i + 1));
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
        int[] data = array.getData();
        for(int i = 0; i < data.length; i++) {
            data[i] = (int) ((Math.random() * Integer.MAX_VALUE) + Integer.MIN_VALUE / 2);
        }
    }

    public void fillFromFile(Array array) {
        int[] data = array.getData();
        String filePath = stringScanner("Enter the file path:");
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            for(int i = 0; i < data.length; i++) {
                data[i] = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    public String stringScanner(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
