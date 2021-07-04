package by.epamtc.poliukov.task03.task2.service;

import by.epamtc.poliukov.task03.task2.сomparator.ByMaxElementComparator;
import by.epamtc.poliukov.task03.task2.сomparator.ByMinElementComparator;
import by.epamtc.poliukov.task03.task2.сomparator.BySumComparator;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();
    ByMaxElementComparator byMaxElementComparator = new ByMaxElementComparator();
    ByMinElementComparator byMinElementComparator = new ByMinElementComparator();
    BySumComparator bySumComparator = new BySumComparator();

    int[][] jaggedArray = new int[][] {{5, 7}, {-8, -10, 10}, {8, 1, 2, 3, -40}};

    @Test
    public void sortByMinElement() {
        int[][] expected = new int[][] {{8, 1, 2, 3, -40}, {-8, -10, 10}, {5, 7}};
        arrayService.sort(jaggedArray, byMinElementComparator);
        assertArrayEquals(expected, jaggedArray);
    }

    @Test
    public void sortByMaxElement() {
        int[][] expected = new int[][] {{5, 7}, {8, 1, 2, 3, -40}, {-8, -10, 10}};
        arrayService.sort(jaggedArray, byMaxElementComparator);
        assertArrayEquals(expected, jaggedArray);
    }

    @Test
    public void sortBySum() {
        int[][] expected = new int[][] {{8, 1, 2, 3, -40},{-8, -10, 10}, {5, 7}};
        arrayService.sort(jaggedArray, bySumComparator);
        assertArrayEquals(expected, jaggedArray);
    }

    @Test
    public void reverseArray() {
        int[][] expected = new int[][]{{8, 1, 2, 3, -40}, {-8, -10, 10}, {5, 7}};
        arrayService.reverseArray(jaggedArray);
        assertArrayEquals(expected, jaggedArray);
    }

}