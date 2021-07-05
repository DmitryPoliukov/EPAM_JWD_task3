package by.epamtc.poliukov.task03.task2.сomparator;

import java.util.Comparator;

/**
 * The Class ByByMaxElementComparator specifies function for comparing int[] by maximum element.
 *
 * @author Dmitry Poliukov
 */

public class ByMaxElementComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        int result = 0;
        if(findMax(o1) > findMax(o2)) {
            result = 1;
        }
        else if(findMax(o1) < findMax(o2)) {
            result = -1;
        }
        return result;
    }

    private int findMax(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
