package by.epamtc.poliukov.task03.task2;

import by.epamtc.poliukov.task03.task2.data.ConsoleInputData;
import by.epamtc.poliukov.task03.task2.entity.SortMethod;
import by.epamtc.poliukov.task03.task2.service.ArrayService;
import by.epamtc.poliukov.task03.task2.presentation.ArrayPresentation;
import by.epamtc.poliukov.task03.task2.сomparator.ByMaxElementComparator;
import by.epamtc.poliukov.task03.task2.сomparator.ByMinElementComparator;
import by.epamtc.poliukov.task03.task2.сomparator.BySumComparator;

import java.util.Comparator;
import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        ConsoleInputData consoleInputData = new ConsoleInputData();
        ArrayPresentation arrayPresentation = new ArrayPresentation();
        ArrayService arrayService = new ArrayService();
        HashMap<SortMethod, Comparator<int[]>> hashMap = new HashMap<>();
        hashMap.put(SortMethod.BY_MIN_ELEMENT, new ByMinElementComparator());
        hashMap.put(SortMethod.BY_MAX_ELEMENT, new ByMaxElementComparator());
        hashMap.put(SortMethod.BY_SUM, new BySumComparator());


        int[][] jaggedArray = consoleInputData.enterArray();
        SortMethod method = consoleInputData.method();
        Comparator<int[]> comparator= hashMap.get(method);
        arrayService.sort(jaggedArray, comparator);
        System.out.println("Array is sorted in ascending order");
        arrayPresentation.printArray(jaggedArray);
        arrayService.reverseArray(jaggedArray);
        System.out.println("Array is sorted in descending order");
        arrayPresentation.printArray(jaggedArray);

    }
}
