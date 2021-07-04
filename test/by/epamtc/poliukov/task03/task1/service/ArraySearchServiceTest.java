package by.epamtc.poliukov.task03.task1.service;

import by.epamtc.poliukov.task03.task1.exception.NonValidArrayException;
import by.epamtc.poliukov.task03.task1.wrapper.Array;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArraySearchServiceTest {
    ArraySearchService arraySearchService = new ArraySearchService();

    private static Array sortedArray;
    private static Array unsortedArray;

    @BeforeClass
    public static void initArrays(){
        int[] sortedData = new int[]{-38, -18, 0, 2, 11, 150};
        int[] unsortedData = new int[]{-5, 88, 500, 17, 11, 233, -21, -123, 157};

        try {
            sortedArray = new Array(sortedData);
            unsortedArray = new Array(unsortedData);
        } catch (NonValidArrayException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void binarySearch() throws NonValidArrayException{
        int expected = 4;
        int actual = arraySearchService.binarySearch(sortedArray, 11);
        assertEquals(expected, actual);
    }

    @Test
    public void findMaxElement() throws NonValidArrayException {
        int expected = 500;
        int actual = arraySearchService.findMaxElement(unsortedArray);
        assertEquals(expected, actual);
    }

    @Test
    public void findMinElement() throws NonValidArrayException {
        int expected = -123;
        int actual = arraySearchService.findMinElement(unsortedArray);
        assertEquals(expected, actual);
    }

    @Test
    public void primeNumbersInArray() throws NonValidArrayException {
        List<Integer> expected = new ArrayList<>();
        expected.add(17);
        expected.add(11);
        expected.add(233);
        expected.add(157);

        List<Integer> actual = arraySearchService.primeNumbersInArray(unsortedArray);
        assertEquals(expected, actual);
    }

    @Test
    public void searchFibonacciNumbers() throws NonValidArrayException {
        List<Integer> expected = new ArrayList<>();
        expected.add(233);
        List<Integer> actual = arraySearchService.searchFibonacciNumbers(unsortedArray);
        assertEquals(expected, actual);
    }

    @Test
    public void search3UniqueDigitNumber() {
        List<Integer> expected = new ArrayList<>();
        expected.add(-123);
        expected.add(157);

        List<Integer> actual = arraySearchService.search3UniqueDigitNumber(unsortedArray);
        assertEquals(expected, actual);
    }
}