package by.epamtc.poliukov.task03.task2.input;

import java.util.Scanner;

/**
 * The Class InputScanner read integer or String data.
 *
 * @author Dmitry Poliukov
 */
public class InputScanner {
    private Scanner scanner = new Scanner(System.in);

    public int intScanner(String message) {
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

    public String stringScanner(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
