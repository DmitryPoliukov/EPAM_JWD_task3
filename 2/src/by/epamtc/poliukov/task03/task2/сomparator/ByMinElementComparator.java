package by.epamtc.poliukov.task03.task2.сomparator;

import java.util.Comparator;

public class ByMinElementComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        int result = 0;
        if(findMin(o1) > findMin(o2)) {
            result = 1;
        }
        else if(findMin(o1) < findMin(o2)) {
            result = -1;
        }
        return result;
    }

    private int findMin(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
