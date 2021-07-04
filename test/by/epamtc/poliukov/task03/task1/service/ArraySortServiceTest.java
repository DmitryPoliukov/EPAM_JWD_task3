package by.epamtc.poliukov.task03.task1.service;

import by.epamtc.poliukov.task03.task1.exception.NonValidArrayException;
import by.epamtc.poliukov.task03.task1.wrapper.Array;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySortServiceTest {
    ArraySortService arraySortService = new ArraySortService();

    int[] unsortedData = new int[] {-5, 88, 500, 17, 11, 233, -21, -123, 157};
    int[] expectedData = new int[] {-123, -21, -5, 11, 17, 88, 157, 233, 500};
    Array unsortedArray;
    Array expected;

    {
        try {
            unsortedArray = new Array(unsortedData);
            expected = new Array(expectedData);
        } catch (NonValidArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void selectionSortArray() {
       arraySortService.selectionSortArray(unsortedArray);
        assertEquals(expected, unsortedArray);

    }

    @Test
    public void mergeSortArray() {
        arraySortService.mergeSortArray(unsortedArray);
        assertEquals(expected, unsortedArray);
    }

    @Test
    public void quickSort() {
        arraySortService.quickSort(unsortedArray);
        assertEquals(expected, unsortedArray);
    }
}