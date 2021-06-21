package by.epamtc.poliukov.task03.task1;


import by.epamtc.poliukov.task03.task1.exception.NonValidArrayException;
import by.epamtc.poliukov.task03.task1.inputData.InputData;
import by.epamtc.poliukov.task03.task1.service.ArraySearchService;
import by.epamtc.poliukov.task03.task1.service.ArraySortService;
import by.epamtc.poliukov.task03.task1.wrapper.Array;

import java.util.ArrayList;
import java.util.List;

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
        Array initFromConstructor = null;
        try {
            initFromConstructor = new Array(new int[]{1, 21, -87, 33, 44, -103, 7, 108});
        } catch (NonValidArrayException e) {
        }

        arraySortService.selectionSortArray(randomArray);
        System.out.println("Random Array selection sort: " + randomArray.toString());
        arraySortService.mergeSortArray(fromFileArray);
        System.out.println("Array from file merge sort: " + fromFileArray.toString());
        arraySortService.quickSort(fromConsole);
        System.out.println("Array from console quickSort " + fromConsole);

        int indexBinarySearch = arraySearchService.binarySearch(fromConsole, 1);
        System.out.println("Element index in binary search is " + indexBinarySearch);

        try {
            int maxValue = arraySearchService.findMaxElement(initFromConstructor);
            int minValue = arraySearchService.findMinElement(initFromConstructor);
            System.out.println("Minimum in array is " + minValue);
            System.out.println("Maximum in array is " + maxValue);

            List<Integer> primeNumbers = arraySearchService.primeNumbersInArray(initFromConstructor);
            System.out.println("Prime numbers in array: " + primeNumbers.toString());

            List<Integer> fibonacci = arraySearchService.searchFibonacciNumbers(initFromConstructor);
            System.out.println("Fibonacci numbers in array: " + fibonacci.toString());

            List<Integer> unique3DigitNumber = arraySearchService.search3UniqueDigitNumber(initFromConstructor);
            System.out.println("Unique three digit numbers in array: " + unique3DigitNumber.toString());

        } catch (NonValidArrayException e) {
            e.printStackTrace();
        }



    }
}

