package by.epamtc.poliukov.task03.task2.service;

import by.epamtc.poliukov.task03.task2.entity.SortMethod;
import by.epamtc.poliukov.task03.task2.сomparator.ByMaxElementComparator;
import by.epamtc.poliukov.task03.task2.сomparator.ByMinElementComparator;
import by.epamtc.poliukov.task03.task2.сomparator.BySumComparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ArrayService {

    public void sort(int[][] jaggedArray, Comparator<int[]> arrayComparator) {
        if (isNull(jaggedArray)) {
            return;
        }

        for (int i = 0; i < jaggedArray.length-1; i++){
            for (int j = jaggedArray.length - 1; j > i; j--){
                if (arrayComparator.compare(jaggedArray[j-1], jaggedArray[j]) == 1) {
                    toSwap(jaggedArray, j - 1, j);
                }
            }
        }
    }

    private boolean isNull(int[][] jaggedArray) {
        return jaggedArray == null;
    }

    private void toSwap(int [][]array, int firstElement, int secondElement) {
        int[] temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }

    public void reverseArray(int[][] array) {
        if (isNull(array)) {
            return;
        }
        int[] temp;
        for(int i = 0; i < array.length / 2; i++){
           temp = array[i];
           array[i] = array[array.length - 1 - i];
           array[array.length - 1 - i] = temp;
        }
    }
    public Map<SortMethod, Comparator<int[]>> hashMap() {
        Map<SortMethod, Comparator<int[]>> hashMap = new HashMap<>();
        hashMap.put(SortMethod.BY_MIN_ELEMENT, new ByMinElementComparator());
        hashMap.put(SortMethod.BY_MAX_ELEMENT, new ByMaxElementComparator());
        hashMap.put(SortMethod.BY_SUM, new BySumComparator());
        return hashMap;
    }
}
