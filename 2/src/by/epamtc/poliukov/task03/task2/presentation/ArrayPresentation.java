package by.epamtc.poliukov.task03.task2.presentation;

import by.epamtc.poliukov.task03.task2.data.ConsoleInputData;

import java.util.Arrays;

public class ArrayPresentation {
    ConsoleInputData consoleInputData = new ConsoleInputData();
    public void printArray(int[][] array){
        for(int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
