package by.epamtc.poliukov.task03.task2;

import by.epamtc.poliukov.task03.task2.data.ConsoleInputData;
import by.epamtc.poliukov.task03.task2.entity.SortMethod;
import by.epamtc.poliukov.task03.task2.service.ArrayService;
import by.epamtc.poliukov.task03.task2.presentation.ArrayPresentation;


import java.util.Comparator;


public class Runner {
    public static void main(String[] args) {
        ConsoleInputData consoleInputData = new ConsoleInputData();
        ArrayPresentation arrayPresentation = new ArrayPresentation();
        ArrayService arrayService = new ArrayService();


        int[][] jaggedArray = consoleInputData.enterArray();
        SortMethod method = consoleInputData.method();
        Comparator<int[]> comparator = arrayService.hashMap().get(method);
        arrayService.sort(jaggedArray, comparator);
        System.out.println("Array is sorted in ascending order");
        arrayPresentation.printArray(jaggedArray);
        System.out.println("Array is sorted in descending order");
        arrayService.reverseArray(jaggedArray);
        arrayPresentation.printArray(jaggedArray);

    }
}
