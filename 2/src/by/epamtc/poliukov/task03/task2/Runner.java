package by.epamtc.poliukov.task03.task2;

import by.epamtc.poliukov.task03.task2.data.ConsoleInputData;
import by.epamtc.poliukov.task03.task2.entity.SortMethod;
import by.epamtc.poliukov.task03.task2.logic.Logic;
import by.epamtc.poliukov.task03.task2.presentation.ArrayPresentation;

public class Runner {
    public static void main(String[] args) {
        ConsoleInputData consoleInputData = new ConsoleInputData();
        ArrayPresentation arrayPresentation = new ArrayPresentation();
        Logic logic = new Logic();

        int[][] jaggedArray = consoleInputData.enterArray();
        SortMethod method = consoleInputData.method();
        int[][] sortIncreaseJaggedArray = logic.sortByMethod(jaggedArray, method);
        int[][] sortDecreaseJaggedArray = logic.reverseArray(sortIncreaseJaggedArray);
        System.out.println("Array is sorted in ascending order");
        arrayPresentation.printArray(sortIncreaseJaggedArray);
        System.out.println("Array is sorted in descending order");
        arrayPresentation.printArray(sortDecreaseJaggedArray);

    }
}
