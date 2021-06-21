package by.epamtc.poliukov.task03.task1;


import by.epamtc.poliukov.task03.task1.exception.NonValidArrayException;
import by.epamtc.poliukov.task03.task1.inputData.InputData;
import by.epamtc.poliukov.task03.task1.service.ArraySearchService;
import by.epamtc.poliukov.task03.task1.service.ArraySortService;
import by.epamtc.poliukov.task03.task1.wrapper.Array;

public class Runner {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        ArraySortService arraySortService = new ArraySortService();
        ArraySearchService arraySearchService = new ArraySearchService();

        Array randomArray = new Array();
        inputData.fillRandom(randomArray);
        Array fromFileArray = new Array();
        inputData.fillFromFile(fromFileArray);
        Array fromConsole = new Array(4);
        inputData.fillFromConsole(fromConsole);
        try {
            Array initFromConstructor = new Array(new int[]{-87, 33, 44, -103});
        } catch (NonValidArrayException e) {
        }
        arraySortService.selectionSortArray(randomArray);
        System.out.println("Random Array selection sort: " + randomArray.toString());
        arraySortService.mergeSortArray(fromFileArray);
        System.out.println("Array from file merge sort: " + fromFileArray.toString());
        arraySortService.quickSort(fromConsole);
        System.out.println("Array from console quickSort " + fromConsole);



    }
}

